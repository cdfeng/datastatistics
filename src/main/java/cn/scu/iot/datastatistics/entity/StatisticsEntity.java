package cn.scu.iot.datastatistics.entity;

/**
 * 数据统计实体
 */
public class StatisticsEntity {
    int count;
    int year;
    int month;
    int day;

    @Override
    public String toString() {
        return "StatisticsEntity{" +
                "count=" + count +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
