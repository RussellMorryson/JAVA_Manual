/* Программа, которую вам дают, объявляет LinkedList "словами".
Напишите программу, которая принимает слова в качестве входных 
данных и добавляет их в LinkedList до тех пор, пока его размер 
не станет меньше 5, затем выводите только те слова, длина 
которых превышает 4 символа.

Sample Input
Java
practice
is
makes
perfect

Sample Output
practice
makes
perfect

метод length() возвращает количество символов в строке.
*/
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();
        while(words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
        }
        for (String w: words) {            
            if (w.length() > 4) {
                System.out.println(w);
            }
        }
    }
}