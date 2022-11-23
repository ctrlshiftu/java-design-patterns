package com.iluwatar.templatemethod.com.cherish.logintemplate;

/**
 * 普通用户登录
 *
 * @author zengjia
 */
public class NormalLogin extends LoginTemplate {

    // 省略具体处理，返回一个有默认数据的对象
    @Override
    public LoginModel findLoginUser(String loginId) {
        return new LoginModel().setLoginId(loginId).setPassword("testPassword");
    }
}
