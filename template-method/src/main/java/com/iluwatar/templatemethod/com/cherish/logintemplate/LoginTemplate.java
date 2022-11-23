package com.iluwatar.templatemethod.com.cherish.logintemplate;

/**
 * 登录控制的模板
 *
 * @author zengjia
 */
public abstract class LoginTemplate {

    /**
     * 判断登录数据是否正确
     *
     */
    public final boolean login(LoginModel loginModel) {
        // 1、根据登陆人员的编号去获取相应的数据
        LoginModel loginUser = this.findLoginUser(loginModel.getLoginId());
        if (loginUser != null) {
            // 2 密码加密
            String encryptPwd = this.encryptPwd(loginModel.getPassword());
            // 加密后的密码设置回登录数据模型中
            loginModel.setPassword(encryptPwd);
            // 判断是否匹配
            return this.match(loginModel, loginUser);
        }
        return false;
    }

    /**
     * 判断输入用户与系统查询用户是否匹配
     * @param loginModel 输入用户
     * @param loginUser 系统查询用户
     * @return 是否匹配
     */
    private boolean match(LoginModel loginModel, LoginModel loginUser) {
        return loginModel.equals(loginUser);
    }

    /**
     * 根据登录编号查找并获取用户数据
     * @param loginId 登录编号
     * @return user
     */
    public abstract LoginModel findLoginUser(String loginId);

    /**
     * 密码加密
     */
    public String encryptPwd(String password)
    {
        return password;
    }
}
