// Код сформирован в результате занятия в BOOTCAMP пишем простейший сервер

import java.io.BufferedReader;
import java.in.IDExeption;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(port )) { // Порт может быть разным
            // Нужно ввести в браузере localhost:8080 и нажать Enter
            Socket socket = serverSocket.accept(); // Установление соединения
            System.out.println("Neww client connected!"); // Вывод на экран сообщения в случае установления соединения
            
            // Способ для преобразования символов и строк из двоичного кода
            BufferedReader input = new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream(), StandardCharsets.UTF_8));

            PrintWriter output = new PrintWriter(socket.getOutputStream());


            while(input.ready()); // Цикл для ожидания ввода
            while(input.ready()) {
                System.out.println(input.readLine());
            }

            output.println("HTTP/1.1 200 OK");
            output.println("Content-Type: text/html; charset=utf-8");
            output.println();
            output.println("<h1>Привет от сервера</h1>");
            output.flush();

            // закрытие методов
            input.close();
            output.close();

        } catch (IDExeption e) {
            e.printStackTrace();
        }
    }
}