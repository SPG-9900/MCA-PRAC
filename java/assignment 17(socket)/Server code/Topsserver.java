import java.io.*;
import java.net.*;
public class Topsserver
{
public static void main(String[] args)
{
	try
	{
		ServerSocket ss=new ServerSocket(1234); //serverSocket class
		Socket s=ss.accept(); //connection creation
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF(); //type casting
		System.out.println("message= "+str); //print message from client
		
		ss.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
}