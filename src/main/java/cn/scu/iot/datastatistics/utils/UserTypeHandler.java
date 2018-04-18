package cn.scu.iot.datastatistics.utils;

import cn.scu.iot.datastatistics.enums.UserTypeEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserTypeHandler extends BaseTypeHandler<UserTypeEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, UserTypeEnum userTypeEnum, JdbcType jdbcType) throws SQLException {
        String enumTypeName = userTypeEnum.name();
        String dbTypeName;
        dbTypeName = enumTypeName2dbTypeName(enumTypeName);
        preparedStatement.setString(i,dbTypeName);
    }

    @Override
    public UserTypeEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String dbTypeName = resultSet.getString(s);
        String enumTypeName;
        if(resultSet.wasNull()){
            return null;
        }else{
            enumTypeName = dbTypeName2enumTypeName(dbTypeName);
        }
        return UserTypeEnum.getEnum(enumTypeName);
    }

    @Override
    public UserTypeEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String dbTypeName = resultSet.getString(i);
        String enumTypeName;
        if(resultSet.wasNull()){
            return null;
        }else{
           enumTypeName = dbTypeName2enumTypeName(dbTypeName);
        }
        return UserTypeEnum.getEnum(enumTypeName);
    }

    @Override
    public UserTypeEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String dbTypeName = callableStatement.getString(i);
        String enumTypeName;
        if(callableStatement.wasNull()){
            return null;
        }else{
            enumTypeName = dbTypeName2enumTypeName(dbTypeName);
        }
        return UserTypeEnum.getEnum(enumTypeName);
    }

    private String dbTypeName2enumTypeName(String dbTypeName) {
        if(dbTypeName.equals("free-developer")){
            return "free_developer";
        }else{
            return dbTypeName;
        }
    }
    private String enumTypeName2dbTypeName(String enumTypeName) {
        if(enumTypeName.equals("free_developer")) return "free-developer";
        else return enumTypeName;
    }
}
