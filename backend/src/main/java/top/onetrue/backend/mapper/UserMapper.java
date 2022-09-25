package top.onetrue.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.onetrue.backend.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
