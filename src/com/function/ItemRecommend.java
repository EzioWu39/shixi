package com.function;

import org.json.JSONException;
import org.json.JSONObject;

import com.socket.SocketClient;
import com.utils.Protocol;

public class ItemRecommend implements MovieRecommend {

	private ItemRecommend() {};
    //实现单例化
    private static ItemRecommend recommendFactory = new ItemRecommend();
    public static ItemRecommend getRecommendClass() {
    	return recommendFactory;
    }
  //传输内容message:电影名字
	@Override
	public JSONObject getRecommend(String message) {
		// TODO Auto-generated method stub
		SocketClient.getSocketClient().sendMessage(Protocol.GETRECOMMEND + "-" + message);
		JSONObject result = null;
		try {
			result = new JSONObject(SocketClient.getSocketClient().getMessage());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return result;
	}

}
