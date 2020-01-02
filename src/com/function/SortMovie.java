package com.function;

import org.json.JSONException;
import org.json.JSONObject;

import com.socket.SocketClient;
import com.utils.Protocol;

public class SortMovie {
	private SortMovie() {};
    //实现单例化
    private static SortMovie sortFactory = new SortMovie();
    public static SortMovie getSortClass() {
    	return sortFactory;
    }
    //传输内容message:电影类型
	public JSONObject getResult(String message) {
		SocketClient.getSocketClient().sendMessage(Protocol.SORTMOVIE + "-" + message);
		JSONObject result = null;
		try {
			result = new JSONObject(SocketClient.getSocketClient().getMessage());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
}
