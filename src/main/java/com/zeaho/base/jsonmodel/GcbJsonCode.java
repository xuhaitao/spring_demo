package com.zeaho.base.jsonmodel;

/**
 * Created by xht on 2017/2/5.
 */
public class GcbJsonCode {
    public static final int SUCCESS = 0;

    // HTTP 请求方法不正确 (一般为不为post)
    public static final int INVALID_HTTP_METHOD = 1;

    // 没有权限(一般为非登录用户访问(需要登录). 或者访问其他用户的私有数据)
    public static final int PERMISSION_DENIED = 2;

    // 数据不正确
    public static final int INVALID_DATA = 3;

    // 数据格式不正确
    public static final int UNRECOGNIZED_DATA = 4;

    // 表单数据不正确
    public static final int INVALID_FORM_DATA = 5;

    // 登录失败
    public static final int MQ_LOGIN_FAILED = 6;

    // 用户登录失败
    public static final int USER_LOGIN_FAILED = 7;

    // 电话号码已存在
    public static final int PHONE_EXISTS = 8;

    // 电话号码不存在
    public static final int PHONE_NOT_EXISTS = 9;

    // 验证码发送失败
    public static final int VERIFY_SEND_FAILED = 10;

    // 验证码验证错误
    public static final int WRONG_VERIFY_CODE = 11;

    // 注册->失败
    public static final int USER_REGISTER_FAILED = 12;

    // 不是app或GcbClientKey错误
    public static final int IS_NOT_APP = 13;

    // 忘记密码修改失败
    public static final int USER_FORGET_FAILED = 14;

    // 忘记密码->密码不一致
    public static final int USER_FORGET_PWD_DIFFER = 15;

    // 用户未登陆
    public static final int USER_OFFLINE_STATE = 16;

    // 数据提交失败
    public static final int DATA_PUBLISH_FAILED = 17;

    // 信息更新失败
    public static final int INFO_UPDATE_FAILED = 18;

    // 已达上限
    public static final int REACH_THE_MAX = 19;

    // 资源未改变
    public static final int RES_NOT_MODIFIED = 20;

    // 图片上传失败
    public static final int UPLOAD_IMAGE_FAILED = 21;

    public static final int DATA_ALREADY_EXIST = 22;

    public static final int MEMBER_ERROR = 23;
}
