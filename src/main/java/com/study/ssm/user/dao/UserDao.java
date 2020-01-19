package com.study.ssm.user.dao;


import com.study.ssm.user.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from user where name = #{name}")
    User login(String name);

    @Insert("INSERT INTO user (name, password,email,phonenumber) VALUES (#{name},#{passWord},#{email},#{phoneNumber})")
    int register(User user);
}
