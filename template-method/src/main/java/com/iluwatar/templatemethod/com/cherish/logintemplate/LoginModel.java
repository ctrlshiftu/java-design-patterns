package com.iluwatar.templatemethod.com.cherish.logintemplate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 封装进行登录控制所需要的数据
 *
 * @author zengjia
 */
@Getter
@Setter
@EqualsAndHashCode
@Accessors(chain = true)
public class LoginModel {

    /**
     * 登录人员的编号，通用的，可能是用户编号，也可能是工作人员编号
     */
    private String loginId;

    /**
     * 登录密码
     */
    private String password;
}
