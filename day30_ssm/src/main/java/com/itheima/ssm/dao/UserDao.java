package com.itheima.ssm.dao;

import com.itheima.ssm.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao {
    @Select("select * from user where number = #{number} and password = #{password}")
    User findUser(User user);
    @Insert("insert into user (number,password,mobile) values (#{number},#{password},#{mobile})")
    int save(User user);
}
