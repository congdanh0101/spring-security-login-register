package springboot.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    public String homePage(){
        return "index";
    }
}
