/* Вам предоставляется программа, которая принимает длину 
массива в качестве первого ввода, создает его, а затем 
принимает следующие входные данные в качестве элементов массива.

Завершите программу, чтобы просмотреть массив и вычислить 
сумму чисел, кратных 4.

Sample Input
5
4
9
16
2
7

Sample Output
20

Чтобы проверить, кратно ли число 4, используйте оператор по 
модулю %, чтобы разделить его на 4 и проверить остаток.
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) 
   {
       Scanner scanner = new Scanner(System.in);
       int length = scanner.nextInt();
       int[] array =  new int[length];
       int sum = 0;
       for (int i = 0; i < length; i++) 
       {
           array[i] = scanner.nextInt();
       }
       
       for (int j = 0; j < length; j++)
       {
           if (array[j] % 4 == 0) 
           {
               sum = sum + array[j];
           }
       }
       System.out.println(sum);       
   }
}