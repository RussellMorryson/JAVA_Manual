import java.in.IDExeption;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(port 8080)) { // Порт может быть разным
            // Нужно ввести в браузере localhost:8080 и нажать Enter
            Socket socket = serverSocket.accept(); // Установление соединения
            System.out.println("Neww client connected!"); // Вывод на экран сообщения в случае установления соединения
        }catch (IDExeption e) {
            e.printStackTrace();
        }
    }
}