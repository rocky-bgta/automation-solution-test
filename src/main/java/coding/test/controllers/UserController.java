package coding.test.controllers;


import coding.test.models.UserModel;
import coding.test.services.LoginService;
import coding.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    LoginService loginService;

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping
    public String login(@RequestParam String username) {
        return loginService.login(username);
    }
}
