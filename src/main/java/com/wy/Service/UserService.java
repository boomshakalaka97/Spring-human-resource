package com.wy.Service;

import com.wy.Dao.UserDao;
import com.wy.Util.IdUtil;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.wy.Entity.User;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public  User findUserById(String id) {
        User user = null;
      //  System.out.println(id);
        try {
            user = userDao.findByUserId(id);
        } catch (Exception e) {
        }
        return user;
    }

    public  User findUserByName(String name) {
        User user = null;
        try {
            user = userDao.findByUserName(name);
        } catch (Exception e) {
        }
        return user;
    }

    public void addUser(User user){
        try{
            User new_user=new User();
            new_user.setUserId(IdUtil.generateId());
            new_user.setUserName(user.getUserName());
            new_user.setPassword(user.getPassword());
            new_user.setAuthority(user.getAuthority());
            userDao.save(new_user);
        }catch(Exception e){

        }
    }

        public ReturnUtil checkIn(User user){
        User new_user=userDao.findByUserName(user.getUserName());
        if(new_user==null) return ReturnUtil.err("用户名不存在");
        if(new_user.getPassword().equals(user.getPassword())==false)return ReturnUtil.err("密码错误");
        else return ReturnUtil.ok(new_user);
    }

    public String deleteUser(User user){
        try{
            userDao.delete(user);
                    return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }

    public String updatePassword(User user){
        try{
            userDao.save(user);
            return "更新成功";
        }catch (Exception e) {
            return "更新失败";
        }
    }
    public String updateAuthority(User user){
        try{
            userDao.save(user);
            return "更新成功";
        }catch (Exception e) {
            return "更新失败";
        }
    }
}