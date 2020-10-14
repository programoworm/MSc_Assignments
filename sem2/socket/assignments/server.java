import java.io.*;
import java.net.*;
class server4{
  public static void main(String args[])throws IOException{
    try{
      ServerSocket server=new ServerSocket(9999);
      System.out.println("Server initiated");
      Socket sckt=server.accept();
      System.out.println("Server has connected");
      PrintWriter out=new PrintWriter(sckt.getOutputStream(),true);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedReader obj=new BufferedReader(new InputStreamReader(sckt.getInputStream()));
      String term=obj.readLine();
      System.out.println("The terminating message is set to: " + term);
      while(true){
	      System.out.println("Waiting for client to send: ");
	      String s=obj.readLine();
	      System.out.println("Received message from client is: "+s);
	      if(s.equalsIgnoreCase(term)){
          System.out.println("So terminating the communication...");
          break;  
        }
        System.out.print("Enter the message to send from server: ");
        s=br.readLine();
        out.println(s);
        if(s.equalsIgnoreCase(term))
          break;
      }
      obj.close();
      out.close();
      sckt.close();
      server.close();
    }
    catch(Exception e){
      System.out.println("Unsuccessful!!");
    }
  }
}