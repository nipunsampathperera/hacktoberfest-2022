package com.company;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            System.out.println("About to creat server socket");
            ServerSocket server =new ServerSocket(50001);
            System.out.println("2.created");
            System.out.println("3.about to accept client");
            Socket client = server.accept();
            System.out.println("4.accept client");
            System.out.println("5.about write data to client");

            DataOutputStream os = new DataOutputStream(client.getOutputStream());
            os.writeBytes("Hello Socket\n");

            System.out.println("6.write data");

            System.out.println("about close socket");
            client.close();
            System.out.println("27");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
