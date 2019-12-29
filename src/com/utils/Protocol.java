package com.utils;

public class Protocol {
    public static final String GETCOMMENT = "getComment";		//获取用户评论（协议-电影名）
    public static final String SETCOMMENT = "setComment";		//写评论（协议-json消息）
    public static final String COMMENTSUCCESS = "commentSuccess";		//评论成功
    public static final String COMMENTFAILD = "commentFaild";			//评论失败
    public static final String GETRECOMMEND = "getRecommend";	//得到基于物品的推荐（协议-电影名）
    public static final String GETUSERRECOMMEND = "getUserRecommend";	//得到基于用户的推荐（协议-用户名）
    public static final String GETSORTRECOMMEND = "getSortRecommend";	//未注册根据标签的推荐（协议-标签字符串）
    public static final String SORTMOVIE = "sortMovie";					//电影分类（协议-电影类型）
    public static final String SEARCH = "search";				//搜索（协议-搜索内容）
    public static final String LOGIN = "login";					//登录（协议-用户|密码）
    public static final String LOGOUT = "logout";				//注销（协议-用户名）
    public static final String REGISTER = "register";			//注册（协议-用户|密码）
    public static final String LOGINSUCCESS = "loginSuccess";			//登录成功消息
    public static final String LOGINFAILED = "loginFailed";				//登录失败消息
    public static final String LOGINNULL = "loginNull";					//登录用户名或密码为空消息
    public static final String REGISTERSUCCESS = "registerSuccess";		//注册成功消息
    public static final String REGISTERFAILED = "registerFailed";		//注册失败消息
    public static final String REGISTEREXIST = "registerExist";			//注册用户已存在消息
    public static final String REGISTERNULL = "registerNull";			//注册用户名或密码为空消息
    public static final String LOGOUTSUCCESS = "logoutSuccess";			//注销成功
    public static final String LOGOUTFAILED = "logoutFailed";			//注销失败
}
