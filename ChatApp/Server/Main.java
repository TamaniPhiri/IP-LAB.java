package ChatApp.Server;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            DatagramSocket socket=new DatagramSocket(3000);
            while (true) {
                byte[] receiveData=new byte[1024];
                DatagramPacket receivePacket=new DatagramPacket(receiveData, 0);
                socket.receive(receivePacket);

                String clientMessage=new String(receivePacket.getData());
                System.out.println(clientMessage);

                InetAddress clInetAddress=receivePacket.getAddress();
                int clientPort=receivePacket.getPort();
                String serverResponse="Hello from server";
                byte[] sendData=serverResponse.getBytes();
                DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length,clInetAddress,clientPort);
                socket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
