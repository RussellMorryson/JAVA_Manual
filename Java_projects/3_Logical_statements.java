/* Вы тур-менеджер, и вам нужна программа, которая будет 
определять небольшие страны.
Страна считается небольшой, если ее население составляет 
менее 10000 человек, а площадь - менее 10000 гектаров.
Данная программа принимает население и площадь в 
качестве входных данных.

Завершите программу для вывода "small country", 
если выполнены оба условия. В противном случае ничего не выводите.

Sample Input
9955
7522

Sample Output
small country

Используйте && для объединения условий.
*/

import java.util.Scanner;
public class Main 
{
   public static void main(String[] args) 
   {
       Scanner read = new Scanner(System.in);
       int population = read.nextInt();
       int area = read.nextInt();
       if (population <= 10000 && area <= 10000)
       {
          System.out.println("small country");
       }
   }   
}