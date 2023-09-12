
// Java program to illustrate Client Side Programming 
// for Simple Calculator using TCP 

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.InetAddress; 
import java.net.Socket; 
import java.net.UnknownHostException; 
import java.util.Scanner; 
  
public class MathClient_TCP 
{ 
    public static void main(String[] args) throws IOException 
    { 
        InetAddress ip = InetAddress.getLocalHost(); 
        int port = 65; 
        Scanner sc = new Scanner(System.in); 
          
        Socket s = new Socket(ip, port);                         // Step 1: Open the socket connection.
  
        // Step 2: Communication-get the input and output stream 
        DataInputStream dis = new DataInputStream(s.getInputStream()); 
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
  
        while (true) 
        { 
            
            System.out.print("Enter the equation in the form: "); 
            System.out.println("'operand operator operand'");            
            String inp = sc.nextLine();                         // Enter in the format operand operator operand
  
            if (inp.equals("bye")) 
                break; 
  
                dos.writeUTF(inp);                             // send the equation to server 
  
                String ans = dis.readUTF(); 		       // wait till request is processed and sent back to client
            System.out.println("Answer=" + ans); 
        } 
    } 
} 
