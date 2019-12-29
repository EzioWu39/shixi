package com.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
    private Socket socket = null;
    private OutputStreamWriter socketOut = null;
    private BufferedWriter bw = null;
    private String serverIp = "101.37.24.119";//"123.56.98.175";
    private int serverPort = 1081;
    private SocketClient() {
        try {
            //初始化客户端
            socket = new Socket(serverIp, serverPort);
            //获取输出打印流
            socketOut = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
            bw = new BufferedWriter(socketOut);
            System.out.println("连接服务器成功!");
            // 已启动连接socket服务器，准备实时接收来自其他客户端的消息
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // 实现单例化
    private static final SocketClient socketClient = new SocketClient();
    public static SocketClient getSocketClient() {// 返回值为ChatManager
        return socketClient;
    }
    //向服务端发送消息
    public void sendMessage(String message) {
        //发送信息
    	try {
    		bw.write(message + "\n");
    		bw.flush();
    	}catch(Exception e) {
    		System.out.println("消息发送失败！");
    		e.printStackTrace();
    	}
    }
    public String getMessage() {
        BufferedReader socketIn = null;
        try {
            InputStreamReader isr = new InputStreamReader(socket.getInputStream(),"UTF-8");
            socketIn = new BufferedReader(isr);
            String message = socketIn.readLine();
            System.out.println("服务端消息："+message);
            //这里是得到消息
            if(!message.equals("")) {
                return message;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
        	System.out.println("消息接收失败！");
            e.printStackTrace();
        }
        return "";
    }
    //断开时关闭连接
    public void shutDownClient() {
        //依次关闭各种流
    	try {
    		bw.write("bye");
    		bw.flush();
    		bw.close();
    		socketOut.close();
    	}catch(Exception e) {
    		System.out.println("消息发送失败！");
    		e.printStackTrace();
    	}
        try{
            socket.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
