package cyber.login.jwt.system.loginsystemjwt.user.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import cyber.login.jwt.system.loginsystemjwt.user.models.UserModel;


public interface UserRepository extends JpaRepository<UserModel, UUID>{
    UserDetails findByEmail(String email);
}
