package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();


    void saveUser(User user);

    //更新操作
    void updateUser(User user);



    //删除操作

    void deleteUser(Integer id);


    User findById(Integer userId);


    List<User> findByName(String username);


    int findTotal();
}
