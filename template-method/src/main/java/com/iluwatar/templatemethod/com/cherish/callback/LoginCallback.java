package com.iluwatar.templatemethod.com.cherish.callback;

import com.iluwatar.templatemethod.com.cherish.logintemplate.LoginModel;

/**
 * 使用回调实现模板方法模式
 *
 * 1） 定义一个模板方法需要的回调接口；
 *      回调接口中需要把所有可以被扩展的方法都要定义出来。
 * 2）LoginModel一致；
 * 3）重新定义 LoginTemplate,主要由以下变化
 *      不再是抽象类，所有抽象方法都删除；
 *      模板方法，即 login() 方法，添加一个参数，传入回调接口；
 *      在模板方法实现中，除了在模板中固定的实现外，所有可以被扩展的方法，都应通过回调接口调用。
 * 4）直接在调用的地方传入回调的实现，通常可以通过匿名内部类的方式来实现回调接口。
 * 5）客户端使用匿名内部类实现回调接口，并实现其中想要扩展的方法。
 *
 * @author zengjia
 */
public interface LoginCallback {

    /**
     * 根据登录编号查找和获取存储中响应的数据
     * @param loginId 登录编号
     * @return 登录编号相应的数据
     */
    LoginModel findLoginUser(String loginId);

    /**
     * 密码加密
     * @param password 原密码
     * @param template 获取加密的具体实现或默认实现
     * @return
     */
    String encryptPassword(String password, LoginTemplate template);

    /**
     * 判断输入用户与系统用户是否匹配
     * @param loginModel 输入用户
     * @param loginUser 系统用户
     * @param loginTemplate 登录模板
     * @return 匹配成功或者失败
     */
    boolean match(LoginModel loginModel, LoginModel loginUser, LoginTemplate loginTemplate);

}
