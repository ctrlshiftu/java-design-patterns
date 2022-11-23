package com.iluwatar.templatemethod.com.cherish.logintemplate;

/**
 * 工作人员登录控制的处理逻辑
 *
 * @author zengjia
 */
public class WorkerLogin extends LoginTemplate {


    @Override
    public LoginModel findLoginUser(String loginId) {
        return new LoginModel().setLoginId(loginId).setPassword("workerPassword");
    }

    @Override
    public String encryptPwd(String password) {
        // 覆盖父类的方法，提供真正的加密实现
        // 使用 MD5, DES 等加密算法
        System.out.println("使用md5加密");
        return super.encryptPwd(password);
    }
}
