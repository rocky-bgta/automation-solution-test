package coding.test.controllers;


import coding.test.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping()
public class SecurityController {

    @Autowired
    SecurityService securityService;


    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return securityService.login(username, password);
    }
}
