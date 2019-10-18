package cn.moriartyzzb.repository;



import cn.moriartyzzb.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserRepository extends BaseMapper<User> {
}

