/* Напишите программу, которая принимает числа в 
качестве входных данных и возвращает первое число, 
возведенное в степень второго числа.

Sample Input
2
4

Sample Output
16.0

Use Math.pow() method.
*/

import java.util.Scanner;

class Main 
{
   public static void main(String[] args) 
   {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();
       
       double num3 = Math.pow(num1, num2);     
       System.out.println(num3);  
   }
}