package com.function;

import org.json.JSONException;
import org.json.JSONObject;

import com.socket.*;
import com.utils.Protocol;

public class UserRecommend implements MovieRecommend {

	private UserRecommend() {};
    //实现单例化
    private static UserRecommend recommendFactory = new UserRecommend();
    public static UserRecommend getRecommendClass() {
    	return recommendFactory;
    }
  //传输内容message:用户名
	@Override
	public JSONObject getRecommend(String message) {
		// TODO Auto-generated method stub
		SocketClient.getSocketClient().sendMessage(Protocol.GETUSERRECOMMEND + "-" + message);
		JSONObject result = null;
		try {
			result = new JSONObject(SocketClient.getSocketClient().getMessage());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return result;
	}

}
