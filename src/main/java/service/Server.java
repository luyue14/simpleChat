package service;

import global.ClientOutputStreamSessionFactory;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by luyue on 2016/12/5.
 */
public class Server {
    //ArrayList clientOutputStreams ;

    public void go(){
        //clientOutputStream = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(5000);
            while (true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                ClientOutputStreamSessionFactory.getClientOutputStream().getOutputStreams().add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("connected");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
