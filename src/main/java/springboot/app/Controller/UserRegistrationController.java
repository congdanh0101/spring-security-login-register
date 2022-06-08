package springboot.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springboot.app.DTO.UserRegistrationDTO;
import springboot.app.Service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDTO(){
        return new UserRegistrationDTO();
    }

    @GetMapping()
    public String showRegistrationForm(Model model){
        model.addAttribute("user", userRegistrationDTO());
        return "registration"; 
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO userRegistrationDTO){
        userService.save(userRegistrationDTO);
        return "redirect:/registration?success";
    }
}
