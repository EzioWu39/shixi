package com.utils;

import com.function.*;
import com.socket.SocketClient;

public class testmain {
	public static void main(String[] args) {
		//System.out.println(Comment.getCommentClass().sendResult("123","1233", "654", 1.2f));
		//UserManager.getUserManager().register("126", "321");
		UserManager.getUserManager().login("126", "321");
                UserManager.getUserManager().logout("126");
		//UserRecommend.getRecommendClass().getRecommend("126");
		//ItemRecommend.getRecommendClass().getRecommend("Babes in Toyland (1961)");
		//SearchMovie.getSearchMovieClass().getSerch("toy");
		//SortMovie.getSortClass().getResult("");
		SocketClient.getSocketClient().shutDownClient();
	}
}
