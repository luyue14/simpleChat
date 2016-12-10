package service;

import global.ClientOutputStreamSessionFactory;

import java.io.PrintWriter;
import java.util.Iterator;

/**
 * Created by luyue on 2016/12/5.
 */
public class Call {
    public void tellEveryone(String message) {
        Iterator it = ClientOutputStreamSessionFactory.getClientOutputStream().getOutputStreams().iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
