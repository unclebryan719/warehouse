package com.yeqifu.sys.common;

/**
 * @Author: 落亦-
 * @Date: 2019/11/21 21:39
 */
public class Constast {

    /**
     * 状态码  正常 200  错误  -1
     */
    public static final Integer OK=200;
    public static final Integer ERROR=-1;

    /**
     * 菜单可用状态  0不可用   1可用
     */
    public static final Object AVAILABLE_TRUE = 1;
    public static final Object AVAILABLE_FALSE = 0;

    /**
     * 菜单和权限类型   menu  菜单   permission  权限
     */
    public static final String TYPE_MENU = "menu";
    public static final String TYPE_PERMISSION = "permission";

    /**
     * 用户类型   0 超级管理员   1 管理员   2普通用户
     */
    public static final Integer USER_TYPE_SUPER = 0;

    /**
     * 菜单是否展开 0不展开  1展开
     */
    public static final Integer OPEN_TRUE = 1;
    public static final Integer OPEN_FALSE = 0;
}
