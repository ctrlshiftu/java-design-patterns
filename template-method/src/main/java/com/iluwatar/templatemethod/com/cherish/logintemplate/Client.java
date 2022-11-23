package com.iluwatar.templatemethod.com.cherish.logintemplate;

/**
 * 客户端
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 准备登陆人信息
        LoginModel loginModel = new LoginModel().setLoginId("admin").setPassword("workerPassword");
        // 准备用来进行判断的对象
        WorkerLogin workerLogin = new WorkerLogin();
        NormalLogin normalLogin = new NormalLogin();
        // 登录测试
        boolean flag = workerLogin.login(loginModel);
        System.out.println("可以登录工作平台=" + flag);

        boolean flag2 = normalLogin.login(loginModel);
        System.out.println("普通人员登录=" + flag2);


    }
}
