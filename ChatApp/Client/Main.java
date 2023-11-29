package ChatApp.Client;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            DatagramSocket socket= new DatagramSocket();
            InetAddress serverAddress=InetAddress.getByName("localhost");

            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.println("You: ");
                String message=scanner.nextLine();
                byte[] sendData= message.getBytes();
                DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length,serverAddress,3000);
                socket.send(sendPacket);

                byte[] receiveData=new byte[1024];
                DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String serverResponse=new String(receivePacket.getData());
                System.out.println(serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
