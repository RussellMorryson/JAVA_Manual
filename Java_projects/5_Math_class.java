/* Для вашего урока математики вам нужна программа для 
вычисления факториала числа.
Вам дается программа, которая принимает число в качестве 
входных данных.

Завершите программу для вычисления факториала 
заданного числа и выведите его.

Sample input
6

Sample output
720

Объяснение
Факториал числа равен произведению всех чисел, меньших 
или равных данному числу.
Факториал 6 будет равен 6*5*4*3*2*1 = 720.


Подсказка
Используйте цикл while для вычисления факториала числа.

Используйте в своих расчетах уже определенные переменные факта.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
	    Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int fact = 1;
            int Factorial = 1;            
        
        while (fact <= number) 
        {            
            Factorial = Factorial * fact;
            fact++;
        }
        System.out.println(Factorial);            
    }
}