package com.function;

import org.json.JSONException;
import org.json.JSONObject;

import com.socket.SocketClient;
import com.utils.Protocol;

public class SortRecommend implements MovieRecommend {
	
	private SortRecommend() {};
    //实现单例化
    private static SortRecommend recommendFactory = new SortRecommend();
    public static SortRecommend getRecommendClass() {
    	return recommendFactory;
    }
    //传输内容message:多个电影标签
	@Override
	public JSONObject getRecommend(String message) {
		// TODO Auto-generated method stub
		SocketClient.getSocketClient().sendMessage(Protocol.GETSORTRECOMMEND + "-" + message);
		JSONObject result = null;
		try {
			result = new JSONObject(SocketClient.getSocketClient().getMessage());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return result;
	}

}
