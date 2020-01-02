package com.function;

import com.socket.SocketClient;
import com.utils.Protocol;

import org.json.JSONObject;

import java.util.Calendar;

public class Comment {
    private Comment() {};
    //实现单例化
    private static Comment commentFactory = new Comment();
    public static Comment getCommentClass() {
    	return commentFactory;
    }
    //发送评论
    public boolean sendResult(String username, String moivename, String comment, float rating){
        String message = "{\"username\":\"" + username + "\",\"moviename\":\"" + moivename
        		+ "\",\"comment\":\"" + comment + "\",\"rating\":" + rating + "}";
        SocketClient.getSocketClient().sendMessage(Protocol.SETCOMMENT + "-" + message);
        String backmessage = SocketClient.getSocketClient().getMessage();
        if(backmessage.equals(Protocol.COMMENTSUCCESS)) return true;
        else return false;
    }
    //得到用户的评论
    public JSONObject getComment(String movieName){
        SocketClient.getSocketClient().sendMessage(Protocol.GETCOMMENT + "-" + movieName);
        String message = SocketClient.getSocketClient().getMessage();
        JSONObject result = null;
        try {
            result = new JSONObject(message);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
