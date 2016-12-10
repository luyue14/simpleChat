package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by luyue on 2016/12/5.
 */
public class ClientHandler implements Runnable{
    BufferedReader reader;
    Socket sock;

    public ClientHandler(Socket sock){
        try{
            this.sock = sock;
            InputStreamReader isReader = new InputStreamReader(this.sock.getInputStream());
            reader = new BufferedReader(isReader);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String message;
        try{
            while((message = reader.readLine())!=null){
                System.out.println("read message : "+message);
                new Call().tellEveryone(message);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
