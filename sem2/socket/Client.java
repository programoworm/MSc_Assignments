//package com.soc;
import java.net.Socket;
import java.io.*;
class Client{
	public static void main(String[] args) throws Exception {
		String ip="localhost";
		int port=9999;
		Socket s=new Socket(ip,port);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		System.out.println("Server: "+str);
		//OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println("Message from client");
		//os.flush();
	}
}