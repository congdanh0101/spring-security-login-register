package springboot.app.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import springboot.app.DTO.UserRegistrationDTO;
import springboot.app.Model.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDTO userRegistrationDTO);

}
