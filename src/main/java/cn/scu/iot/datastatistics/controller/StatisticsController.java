package cn.scu.iot.datastatistics.controller;

import cn.scu.iot.datastatistics.entity.StatisticsEntity;
import cn.scu.iot.datastatistics.mapper.StatisticsEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatisticsController {

    @Autowired
    StatisticsEntityMapper statisticsEntityMapper;

    @GetMapping("/statisticsByYear")
    public List<StatisticsEntity> getStatisticsByYear() {
        List<StatisticsEntity> statistics = statisticsEntityMapper.getStatisticsByYear();
        return statistics;
    }

    @GetMapping("/statisticsByMonth")
    public List<StatisticsEntity> getStatisticsByMonth() {
        List<StatisticsEntity> statistics = statisticsEntityMapper.getStatisticsByMonth();
        return statistics;
    }

    @GetMapping("/statisticsByDay")
    public List<StatisticsEntity> getStatisticsByDay() {
        List<StatisticsEntity> statistics = statisticsEntityMapper.getStatisticsByDay();
        return statistics;
    }
}
