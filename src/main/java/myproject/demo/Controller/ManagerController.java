package myproject.demo.Controller;

import myproject.demo.Model.User;
import myproject.demo.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/myproject/manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @PostMapping("/create")
    public void create(@RequestBody User user) {
        managerService.create(user);
    }
}
