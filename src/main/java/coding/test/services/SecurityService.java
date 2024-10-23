package coding.test.services;

import coding.test.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    UserService userService;

    public String login(String username, String password) {
        List<UserModel> userList = userService.getAllUser();

        boolean userExists = userList.stream()
                .anyMatch(user -> user.getName().equals(username) && user.getPassword().equals(password));

        if (userExists) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }

    }

}
