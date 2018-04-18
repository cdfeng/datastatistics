package cn.scu.iot.datastatistics.entity;

import cn.scu.iot.datastatistics.enums.UserAlertType;
import cn.scu.iot.datastatistics.enums.UserStateEnum;
import cn.scu.iot.datastatistics.enums.UserTypeEnum;

public class UserBasicInfo {

    long uid;//唯一标识码
    String name;//账号，必须是电子邮件格式
    String nickname;//用户昵称
    String passwd;//以MD5（name+passwd）形式存储
    String unionId;//微信各个平台用户唯一标识
    String thirdId;//微信openid
    UserTypeEnum userType; //'free-developer','weixin','admin','demo','company'
    double deposit;  //double，用户当前存款，单位分，默认值为0；
    long maxApplyDevs;  //能够申请的设备最大数量，默认为5
    long dataMaxNumPerDev;  //每台设备最多支持的上传参数数量，默认为5
    long textMaxDevs;      //最多申请的测试设备数量
    long haveMaxDevs;        //用户 已拥有 申请的设备数量
    long hisDataMaxNumPerDev; //每台设备最多支持的累积型上传参数数量,默认为2
    long apiMaxNum;      //设备支持的控制接口最大数量，默认值为20
    String imgUrl;
    UserStateEnum state;   //'active','banned','inactive'
    String phone;   //用户手机号
    String company; //公司 名称
    long rTime;    //入驻时间戳
    long thridPlatformId;   //第三方平台表中的id
    UserAlertType alertType;  //接收警报默认地址：sms:手机  email:邮箱  weixin:微信 all:全部
    int isAlert;   //'是否接收警报:1:接收 0:不接收'
    String type;
    String info;     //'json格式.存储用户信息'

    @Override
    public String toString() {
        return "UserBasicInfo{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", unionId='" + unionId + '\'' +
                ", thirdId='" + thirdId + '\'' +
                ", userType=" + userType +
                ", deposit=" + deposit +
                ", maxApplyDevs=" + maxApplyDevs +
                ", dataMaxNumPerDev=" + dataMaxNumPerDev +
                ", textMaxDevs=" + textMaxDevs +
                ", haveMaxDevs=" + haveMaxDevs +
                ", hisDataMaxNumPerDev=" + hisDataMaxNumPerDev +
                ", apiMaxNum=" + apiMaxNum +
                ", imgUrl='" + imgUrl + '\'' +
                ", state=" + state +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", rTime=" + rTime +
                ", thridPlatformId=" + thridPlatformId +
                ", alertType=" + alertType +
                ", isAlert=" + isAlert +
                ", type='" + type + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public UserBasicInfo() {
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setMaxApplyDevs(long maxApplyDevs) {
        this.maxApplyDevs = maxApplyDevs;
    }

    public void setDataMaxNumPerDev(long dataMaxNumPerDev) {
        this.dataMaxNumPerDev = dataMaxNumPerDev;
    }

    public void setTextMaxDevs(long textMaxDevs) {
        this.textMaxDevs = textMaxDevs;
    }

    public void setHaveMaxDevs(long haveMaxDevs) {
        this.haveMaxDevs = haveMaxDevs;
    }

    public void setHisDataMaxNumPerDev(long hisDataMaxNumPerDev) {
        this.hisDataMaxNumPerDev = hisDataMaxNumPerDev;
    }

    public void setApiMaxNum(long apiMaxNum) {
        this.apiMaxNum = apiMaxNum;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setState(UserStateEnum state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setrTime(long rTime) {
        this.rTime = rTime;
    }

    public void setThridPlatformId(long thridPlatformId) {
        this.thridPlatformId = thridPlatformId;
    }

    public void setAlertType(UserAlertType alertType) {
        this.alertType = alertType;
    }

    public void setIsAlert(int isAlert) {
        this.isAlert = isAlert;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getUnionId() {
        return unionId;
    }

    public String getThirdId() {
        return thirdId;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public double getDeposit() {
        return deposit;
    }

    public long getMaxApplyDevs() {
        return maxApplyDevs;
    }

    public long getDataMaxNumPerDev() {
        return dataMaxNumPerDev;
    }

    public long getTextMaxDevs() {
        return textMaxDevs;
    }

    public long getHaveMaxDevs() {
        return haveMaxDevs;
    }

    public long getHisDataMaxNumPerDev() {
        return hisDataMaxNumPerDev;
    }

    public long getApiMaxNum() {
        return apiMaxNum;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public UserStateEnum getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }

    public long getrTime() {
        return rTime;
    }

    public long getThridPlatformId() {
        return thridPlatformId;
    }

    public UserAlertType getAlertType() {
        return alertType;
    }

    public int getIsAlert() {
        return isAlert;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        return info;
    }
}
