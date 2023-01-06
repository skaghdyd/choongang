package __chatProject;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
 
public class ServerTest {
    private ServerSocket serverSocket;
    private List<ChatHandler> list;
 
    public ServerTest() {
        try {
            serverSocket = new ServerSocket(9500);
            System.out.println("서버 대기중");
 
            list = new ArrayList<ChatHandler>();
 
            while (true) {
                Socket socket = serverSocket.accept();
                ChatHandler handler = new ChatHandler(socket, list);
                handler.start();
                list.add(handler);
            } // while
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        new ServerTest();
    }
}