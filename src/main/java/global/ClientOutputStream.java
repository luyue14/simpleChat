package global;

import java.util.ArrayList;

/**
 * Created by luyue on 2016/12/5.
 */
public class ClientOutputStream {
    private ArrayList outputStreams ;

    protected ClientOutputStream() {
        outputStreams = new ArrayList();
    }

    public synchronized ArrayList getOutputStreams() {
        return outputStreams;
    }

    public synchronized void setOutputStreams(ArrayList clientOutputStreams) {
        this.outputStreams = clientOutputStreams;
    }
}
