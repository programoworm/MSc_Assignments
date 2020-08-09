//package com.soc;
import java.net.*;
import java.io.*;
class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("Server Started...");
		System.out.println("Server is waiting for client...");
		Socket s=ss.accept();
		System.out.println("Client connected...");
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		out.println("Message from Server");
		//while(true)
		//{
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println("Client: "+str);
		//}
	}
}