package cn.scu.iot.datastatistics.enums;

public enum UserTypeEnum {
    free_developer,weixin,admin,demo,company;

    public static UserTypeEnum getEnum(String enumTypeName) {
        UserTypeEnum userTypeEnum=null;
        switch (enumTypeName) {
            case "free_developer":userTypeEnum=free_developer;break;
            case "weixin":userTypeEnum=weixin;break;
            case "admin":userTypeEnum=admin;break;
            case "demo":userTypeEnum=demo;break;
            case "company":userTypeEnum=company;break;
            default:break;
        }
        return userTypeEnum;
    }
}
