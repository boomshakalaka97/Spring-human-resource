package com.wy.Dao;

import com.wy.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface UserDao extends JpaRepository<User,Integer>//这两个参数分别表示类和主键参数类型
{
    //@Query("select t from User t where t.id =?1")//@Query表示自定义的sql语句
    //@Query(value="select * from user where id= ?1 " ,nativeQuery=true)
    User findByUserId(String id);
    User save(User user);
    User findByUserName(String name);
    void delete(User user);
}