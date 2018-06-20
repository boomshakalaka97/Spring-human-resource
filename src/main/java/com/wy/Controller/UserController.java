package com.wy.Controller;

import com.wy.Entity.User;
import com.wy.Service.UserService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /*@RequestMapping(value = "",method=RequestMethod.GET)
    public String index() {
        return "/login";
    }

    @PostMapping(value="/main")
    public  String main(){
        return "/main";
    }

    @RequestMapping(value="/right",method=RequestMethod.GET)
    public String right(){
        return "/right";
    }

    @RequestMapping(value="/top",method=RequestMethod.GET)
    public String top(){
        return "/top";
    }

    @RequestMapping(value="/navigation",method=RequestMethod.GET)
    public String navigation(){
        return "/navigation_bar";
    }*/

    @PostMapping(value = "/findUserById")
    @ResponseBody//该参数表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，
    // 一般在异步获取数据时使用
    public User findUserById(@RequestBody User user) {
        User new_user = userService.findUserById(user.getUserId());

            return new_user;
    }

    @PostMapping(value = "/findUserByName")
    @ResponseBody//该参数表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，
    // 一般在异步获取数据时使用
    public User findUserByName(@RequestBody User user) {
        User new_user = userService.findUserByName(user.getUserName());
        return new_user;
    }

    @PostMapping(value="/signUp")//注册
    @ResponseBody
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PostMapping(value="/signIn")//登陆
    @ResponseBody
    public ReturnUtil checkIn(@RequestBody User user){
        return userService.checkIn(user);
    }

    @PostMapping(value="/delete")//删除用户
    @ResponseBody
    public String deleteUser(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @PostMapping(value="/updatePassword")//更新密码
    @ResponseBody
    public String updatePassword(@RequestBody User user){
        return userService.updatePassword(user);
    }

    @PostMapping(value="/updateAuthority")//更新权限
    @ResponseBody
    public String updateAuthority(@RequestBody User user){
        return userService.updateAuthority(user);
    }
}