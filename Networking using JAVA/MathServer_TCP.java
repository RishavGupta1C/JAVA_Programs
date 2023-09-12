
// Java program to illustrate Server Side Programming 
// for Simple Calculator using TCP 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.StringTokenizer; 
  
public class MathServer_TCP 
{ 
    public static void main(String args[]) throws IOException 
    { 
  
         
        ServerSocket ss = new ServerSocket(65); // Step 1: Establish the socket connection.
        Socket s = ss.accept(); 
           
        DataInputStream dis = new DataInputStream(s.getInputStream());                     // Step 2: Processing the request.
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
  
        while (true) 
        {             
            String input = dis.readUTF(); 
  
            if(input.equals("bye")) 
                break; 
  
            System.out.println("Equation received:-" + input); 
            int result; 
  
             
            StringTokenizer st = new StringTokenizer(input);                             // Use StringTokenizer to break the equation into operand and 
           							                         // operation
  
            int oprnd1 = Integer.parseInt(st.nextToken()); 
            String operation = st.nextToken(); 
            int oprnd2 = Integer.parseInt(st.nextToken()); 
  
             
            if (operation.equals("+"))                                              // perform the required operation.
            { 
                result = oprnd1 + oprnd2; 
            } 
  
            else if (operation.equals("-")) 
            { 
                result = oprnd1 - oprnd2; 
            } 
            else if (operation.equals("*")) 
            { 
                result = oprnd1 * oprnd2; 
            } 
            else
            { 
                result = oprnd1 / oprnd2; 
            } 
            System.out.println("Sending the result..."); 
  
             
            dos.writeUTF(Integer.toString(result));                                // send the result back to the client.
        } 
    } 
} 
