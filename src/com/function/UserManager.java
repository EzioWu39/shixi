package com.function;

import com.socket.SocketClient;
import com.utils.Protocol;
//用于用户登录，注册，注销，修改密码等
public class UserManager {
	private UserManager() {}
	//实现单例化
	private static UserManager userManager = new UserManager();
	public static UserManager getUserManager() {
		return userManager;
	}
	//登录函数，返回登录结果字符串
    public String login(String username, String password){
    	if(username.equals("")||password.equals("")) {
    		return Protocol.LOGINNULL;
    	}
    	else {
    		SocketClient.getSocketClient().sendMessage(Protocol.LOGIN + "-" + username + "|" + password);
    		String result = SocketClient.getSocketClient().getMessage();
    		return result;
    	}
    }
    //注册函数，返回注册结果字符串
    public String register(String username, String password){
    	if(username.equals("")||password.equals("")) {
    		return Protocol.REGISTERNULL;
    	}
    	else {
    		SocketClient.getSocketClient().sendMessage(Protocol.REGISTER + "-" + username + "|" + password);
    		String result = SocketClient.getSocketClient().getMessage();
    		return result;
    	}
    }
    //注销函数，返回注销结果字符串
    public String logout(String username) {
    	SocketClient.getSocketClient().sendMessage(Protocol.LOGOUT + "-" + username);
		String result = SocketClient.getSocketClient().getMessage();
		return result;
    }
}
