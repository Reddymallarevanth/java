import java.io.IOException;
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ServerSocket;
public class MyClient {
public static void main(String[] args) throws IOException {
Socket socket = new Socket("localhost", 8123);
DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
String a = new String ("connecting to the server");
 System.out.println(a); 
dataOut.writeUTF("client side"); 
DataInputStream dataIn = new DataInputStream(socket.getInputStream()); 
String b;
 b=dataIn.readUTF(); 
System.out.println(b); 
System.out.println("message is being sent to the server from the client"); 
dataOut.writeUTF("Hello World"); 
socket.close(); 
}
}
