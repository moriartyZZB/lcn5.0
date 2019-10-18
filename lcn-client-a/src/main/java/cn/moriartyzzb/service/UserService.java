package cn.moriartyzzb.service;





import cn.moriartyzzb.entity.User;

import java.util.List;

public interface UserService {

    Integer addUser(User user);

    List<User> getUsers();

    User getUser(Long id);

    boolean deleteOne(Long id);

    boolean updateUser(User user);

}
