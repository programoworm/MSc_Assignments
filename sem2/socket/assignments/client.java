import java.io.*;
import java.net.Socket;
class client4{
  public static void main(String args[])throws IOException{
    try{
      Socket sckt=new Socket("localhost",9999);
      System.out.println("Client has connected");
      PrintWriter out=new PrintWriter(sckt.getOutputStream(),true);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedReader in=new BufferedReader(new InputStreamReader(sckt.getInputStream()));
      System.out.print("Enter the terminating message : ");
      String term=br.readLine();
      System.out.println("The terminating message is set to: "+term);
      out.println(term);
      while(true){
        System.out.print("Enter the message to send from client : ");
        String s=br.readLine();
        out.println(s);
        if(s.equalsIgnoreCase(term))  
          break;
        System.out.println("Waiting for server to send...");   
        s=in.readLine();
        System.out.println("Received message from server is: "+s);
        if(s.equalsIgnoreCase(term)){
          System.out.println("So terminating the communication...");
          break;  
        }
      }
      out.close();
      in.close();
    }
    catch(Exception e)
    {
      System.out.println("Unsuccessful!!");
    }
  }
}