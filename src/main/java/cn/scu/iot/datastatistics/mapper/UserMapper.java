package cn.scu.iot.datastatistics.mapper;

import cn.scu.iot.datastatistics.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll();
    User getOne(int id);
}
