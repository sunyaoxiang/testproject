package study.w3cschoool_two.java;

import java.io.*;
import java.net.Socket;

/**
 * Created by yaoxiang.sun on 2018/4/24.
 */
public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("Connecting target: " + serverName +" on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to: " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server respon: " + in.readUTF());
        } catch (IOException ioerr) {
            ioerr.printStackTrace();
        }
    }
}
