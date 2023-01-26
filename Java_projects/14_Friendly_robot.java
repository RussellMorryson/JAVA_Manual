/* Вы создаете робота "Welcomer 2000", который никогда 
не перестает приветствовать ни одного встречного 
человека. Вы указываете количество людей, которые 
войдут в комнату, и робот прокричит "Добро пожаловать" 
это количество раз.

Данная вам программа уже принимает число в качестве 
входных данных и вызывает метод в соответствии с 
предоставленным количеством. Проблема в том, что метод 
является неполным. Исправь это.
import java.util.Scanner;

Sample Input
2

Sample Output
Welcome!
Welcome!

Вам нужно выполнить вывод внутри метода.
*/
import java.util.Scanner;
public class Main
{
   public static void main(String[] args) 
   {
       Scanner read = new Scanner(System.in);
       int numberOfPeople = read.nextInt();
       
       for (int i = 0; i < numberOfPeople; i++) {
           welcome();
       }
   }
   public static void welcome() {
       System.out.print("Welcome!");       
   }
}