package cyber.login.jwt.system.loginsystemjwt.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cyber.login.jwt.system.loginsystemjwt.security.TokenService;
import cyber.login.jwt.system.loginsystemjwt.user.dtos.AuthetinticationDto;
import cyber.login.jwt.system.loginsystemjwt.user.dtos.LoginResponseDto;
import cyber.login.jwt.system.loginsystemjwt.user.dtos.RegisterDto;
import cyber.login.jwt.system.loginsystemjwt.user.models.UserModel;
import cyber.login.jwt.system.loginsystemjwt.user.repositories.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid AuthetinticationDto data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((UserModel) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDto(token));
    }


    @PostMapping("/register")
    public ResponseEntity<Object> register (@RequestBody RegisterDto registerDto){
        if (this.userRepository.findByEmail(registerDto.email()) != null ) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());

        UserModel newUser = new UserModel(registerDto.email(), encryptedPassword, registerDto.role());

        this.userRepository.save(newUser);

        return ResponseEntity.ok().build();
    }
}
