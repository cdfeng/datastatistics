package cn.scu.iot.datastatistics.mapper;

import cn.scu.iot.datastatistics.entity.UserBasicInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserBasicInfoMapper {

    List<UserBasicInfo> getAll();
    UserBasicInfo getOne(long id);
}
