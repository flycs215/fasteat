package historiab.fasteat.repository;

import historiab.fasteat.FasteatApplicationTests;
import historiab.fasteat.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends FasteatApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    public UserRepository userRepository;

    @Test
    public void create(){

        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " +newUser);

    }

    public void read(){

    }
    public void update(){

    }
    public void delete(){

    }

}
