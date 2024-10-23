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
        user2.setName("rocky");
        user2.setEmail("demo@gmail.com");
        user2.setPassword("test123");

        UserModel user3 = new UserModel();
        user3.setId(3);
        user3.setName("rahim");
        user3.setEmail("demo@gmail.com");
        user3.setPassword("test1234");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
