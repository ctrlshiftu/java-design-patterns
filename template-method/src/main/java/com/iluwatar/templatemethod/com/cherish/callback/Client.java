package com.iluwatar.templatemethod.com.cherish.callback;

import com.iluwatar.templatemethod.com.cherish.logintemplate.LoginModel;

/**
 * 客户端
 * 总结：
 *      1） 使用继承的方式，抽象方法和具体实现的关系是在编译期间静态决定的，类级关系；
 *      2） 使用回调，这个关系是在运行期间动态决定的，是对象级关系；
 *      3） 相对而言，使用回调机制更灵活，因为 Java 是单继承的。
 * 延申：
 *      回调机制是通过委托的方式来组合功能，耦合性比继承低。
 *      比如某些模板实现的方法，在回调实现的时候可以不调用模板中的方法，而是调用其他实现中的某些功能，也就是说功能不再局限在模板和回调实现上了，可以更灵活地组织功能。
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 准备登陆人信息
        LoginModel loginModel = new LoginModel().setLoginId("admin").setPassword("workerPassword");
        // 准备用来判断的对象
        LoginTemplate loginTemplate = new LoginTemplate();
        // 测试
        boolean flag2 = loginTemplate.login(loginModel, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                return new LoginModel().setLoginId(loginId).setPassword("testPassword");
            }

            @Override
            public String encryptPassword(String password, LoginTemplate template) {
                return template.encryptPassword(password);
            }

            @Override
            public boolean match(LoginModel loginModel, LoginModel loginUser, LoginTemplate loginTemplate) {
                // 自己不需要实现，直接调用模板中的默认实现
                return loginTemplate.match(loginModel, loginUser);
            }
        });
        System.out.println("可以登录工作平台=" + flag2);

        boolean flag1 = loginTemplate.login(loginModel, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {

                return new LoginModel().setLoginId(loginId).setPassword("workerPassword");
            }

            @Override
            public String encryptPassword(String password, LoginTemplate template) {
                System.out.println("使用md5加密");
                return password;
            }

            @Override
            public boolean match(LoginModel loginModel, LoginModel loginUser, LoginTemplate loginTemplate) {
                return loginTemplate.match(loginModel, loginUser);
            }
        });
        System.out.println("可以登录=" + flag1);

    }
}
