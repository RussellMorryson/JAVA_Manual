/* Вы хотите спланировать свой день и составить список дел.
Завершите программу, чтобы принять названия 3 задач 
в качестве входных данных и записать их в файл "tasks.txt "
, каждый на новой строке.

Затем используйте метод ReadFile() для вывода задач.

Sample Code
Workout
Report
Pool

Sample Output
Workout
Report
Pool

Добавьте \n в конец каждой строки, чтобы создать новую строку.
*/

import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while(count < 3) {
                String name = input.nextLine(); 
                f.format(name,"\r\n");
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

      public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
      }
}