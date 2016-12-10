package global;

/**
 * Created by luyue on 2016/12/5.
 */
final public class ClientOutputStreamSessionFactory {
    public static ClientOutputStream clientOutputStream;

    private ClientOutputStreamSessionFactory(){}

    static{
        clientOutputStream = new ClientOutputStream();
    }

    public static ClientOutputStream getClientOutputStream(){
        return clientOutputStream;
    }

}
