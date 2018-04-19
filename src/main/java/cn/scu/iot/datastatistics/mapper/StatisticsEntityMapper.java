package cn.scu.iot.datastatistics.mapper;

import cn.scu.iot.datastatistics.entity.StatisticsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisticsEntityMapper {

    List<StatisticsEntity> getStatisticsByYear();
    List<StatisticsEntity> getStatisticsByMonth();
    List<StatisticsEntity> getStatisticsByDay();

}
