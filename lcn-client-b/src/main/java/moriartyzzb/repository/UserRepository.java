package moriartyzzb.repository;




import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import moriartyzzb.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserRepository extends BaseMapper<User> {
}

