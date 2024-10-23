package coding.test.services;

import coding.test.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<UserModel> getAllUser(){
        List<UserModel> users = new ArrayList<>();

        UserModel user1 = new UserModel();
        user1.setId(1);
        user1.setName("Jack");
        user1.setEmail("demo@gmail.com");

        UserModel user2 = new UserModel();
        user2.setId(2);
        user2.setName("Jack");
        user2.setEmail("demo@gmail.com");

        UserModel user3 = new UserModel();
        user3.setId(2);
        user3.setName("Jack");
        user3.setEmail("demo@gmail.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
