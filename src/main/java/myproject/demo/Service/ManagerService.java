package myproject.demo.Service;

import myproject.demo.Model.User;
import myproject.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    UserRepository userRepository;

    public void create(User user){
        userRepository.save(user);
    }

}
