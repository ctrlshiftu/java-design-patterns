package com.iluwatar.templatemethod.com.cherish.callback;

import com.iluwatar.templatemethod.com.cherish.logintemplate.LoginModel;

/**
 * 回调方式的登录控制模板
 *
 * @author zengjia
 */
public class LoginTemplate {

    public final boolean login(LoginModel loginModel,LoginCallback callback) {
        // 1 根据登陆人员的编号去获取相应的数据
        LoginModel loginUser = callback.findLoginUser(loginModel.getLoginId());
        if (loginUser != null) {
            // 加密
            String encryptPassword = callback.encryptPassword(loginModel.getPassword(), this);
            // 加密后的密码设置到数据模型中
            loginModel.setPassword(encryptPassword);
            // 判断是否匹配
            return callback.match(loginModel, loginUser, this);
        }
        return false;
    }

    /**
     * 对密码进行加密
     * @param password
     * @return
     */
    public String encryptPassword(String password) {
        return password;
    }

    /**
     * 判断输入用户与系统查询用户是否匹配
     * @param loginModel 输入用户
     * @param loginUser 系统查询用户
     * @return 是否匹配
     */
    public boolean match(LoginModel loginModel, LoginModel loginUser) {
        return loginModel.equals(loginUser);
    }
}
