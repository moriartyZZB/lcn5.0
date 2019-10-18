package cn.moriartyzzb.service.impl;


import cn.moriartyzzb.entity.User;
import cn.moriartyzzb.remote.ClientBRemoteI;
import cn.moriartyzzb.repository.UserRepository;
import cn.moriartyzzb.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.esotericsoftware.minlog.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Resource
    UserRepository userRepository;
    @Resource
    ClientBRemoteI clientBRemote;

    @Override
    @LcnTransaction
    //@Transactional(rollbackFor = Exception.class)
    public Integer addUser(User user) {
        int insert = userRepository.insert(user);
        //声明式调用
        Object add = clientBRemote.add();
        System.out.println(add);
        int i=1/0;
        return insert;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.selectList(new QueryWrapper<>());
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public boolean deleteOne(Long id) {
        int i = userRepository.deleteById(id);
        return i>0;
    }

    @Override
    public boolean updateUser(User user) {
        return userRepository.updateById(user)>0;
    }


}
