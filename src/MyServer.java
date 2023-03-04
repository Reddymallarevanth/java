import java.io.IOException;
 import java.io.*;
import java.util.*;
import java.net.Socket; 
import java.net.ServerSocket; 
public class MyServer {
 public static void main(String[] args) throws IOException { 
ServerSocket soc = new ServerSocket(8123);
Socket socket = soc.accept(); 
DataInputStream dataIn = new DataInputStream(socket.getInputStream());
 String a = (String)dataIn.readUTF(); 
System.out.println("Note: " + a); 
DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream()); 
String b = new String("Connection established successfully"); 
 dataOut.writeUTF("server side");
 System.out.println(dataIn.readUTF()); 
soc.close(); 
}
}

