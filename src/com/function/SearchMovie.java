package com.function;

import org.json.JSONException;
import org.json.JSONObject;

import com.socket.SocketClient;
import com.utils.Protocol;

public class SearchMovie {
	private SearchMovie() {};
    //实现单例化
    private static SearchMovie searchFactory = new SearchMovie();
    public static SearchMovie getSearchMovieClass() {
    	return searchFactory;
    }
  //传输内容message:电影名字
    public JSONObject getSerch(String message) {
		// TODO Auto-generated method stub
		SocketClient.getSocketClient().sendMessage(Protocol.SEARCH + "-" + message);
		JSONObject result = null;
		try {
			result = new JSONObject(SocketClient.getSocketClient().getMessage());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
}
