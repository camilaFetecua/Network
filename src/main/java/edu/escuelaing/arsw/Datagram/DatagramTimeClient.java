package edu.escuelaing.arsw.Datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatagramTimeClient {
    public static String Fsiguiente;

    public static void main(String[] args) {
        byte[] sendBuf = new byte[256];
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        DatagramSocket socket = new DatagramSocket();
                        socket.setSoTimeout(5000);
                        byte[] buf = new byte[256];
                        InetAddress address = InetAddress.getByName("127.0.0.1");
                        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
                        socket.send(packet);
                        packet = new DatagramPacket(buf, buf.length);
                        try {
                            socket.receive(packet);
                            String received = new String(packet.getData(), 0, packet.getLength());
                            Fsiguiente=received;
                            System.out.println("Date: " + received);
                        } catch (SocketTimeoutException e) {
                            System.out.println("Date: " + Fsiguiente);

                        }
                        Thread.sleep(5000);
                    } catch (IOException | InterruptedException ex) {
                        Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Date");
                    }
                }
            }

        };
        thread.start();
    }
}