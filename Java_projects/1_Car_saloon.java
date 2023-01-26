/* У вас есть 12 000 долларов, чтобы купить машину.
Вам предоставляется программа, которая принимает 
цену автомобиля в качестве входных данных.

Выведите "да", если цена ниже или равна 12 000.

Sample Input
11000

Sample Output
yes
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {       
       Scanner scanner = new Scanner(System.in);
       int price = scanner.nextInt();
       if (price < 12000) 
       {       
           System.out.println("yes");
       }
   }
}