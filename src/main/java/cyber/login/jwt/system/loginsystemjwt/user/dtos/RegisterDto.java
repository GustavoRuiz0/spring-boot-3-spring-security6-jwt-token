package cyber.login.jwt.system.loginsystemjwt.user.dtos;

import cyber.login.jwt.system.loginsystemjwt.user.enums.UserRole;
import jakarta.validation.constraints.NotNull;

public record RegisterDto(@NotNull String email,@NotNull String password, @NotNull UserRole role ) {
    
}
