package moriartyzzb.web;


import moriartyzzb.entity.User;
import moriartyzzb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public Object getUsers() {
        List<User> list= userService.getUsers();
        Collections.sort(list);
        return list;
    }
    @GetMapping("/getUser")
    public Object getUser(@RequestParam Long id) {
        User user= userService.getUser(id);
        return user;
    }
    @GetMapping("/addUser")
    public Object add() {
        User user = new User();
        user.setUsername("moriarty_client_b");
        user.setPassword("zzb_client_b");
        long resutl=   userService.addUser(user);
        logger.info("insert:"+user.toString()+" result:"+resutl);
        return resutl>0;
    }

    @GetMapping("/deleteOne")
    public Object deleteOne(@RequestParam Long id) {
        userService.deleteOne(id);
        return "删除成功！";
    }

    @GetMapping("/updateUser")
    public Object updateUser(@RequestParam Long id,@RequestParam String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        userService.updateUser(user);
        return "更新成功！";
    }


}
