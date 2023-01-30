/* Вам нужно написать программу-делитель, которая 
будет работать с целыми числами,
Данная вам программа должна принимать два целых 
числа в качестве входных данных и выполнять деление, 
но нам нужно обработать два исключения:
1. делитель не должен быть равен нулю
2. оба входных параметра должны быть целыми числами.

Завершите программу, чтобы справиться с ними. 
Для первого исключения программа должна вывести 
"Ошибка: деление на ноль"; а для второго - "Ошибка: 
неправильный тип значения".

Sample Input
1
b

Sample Output
Mistake: wrong value type

Используйте ArithmeticException для первого 
исключения и InputMismatchException для второго.
*/

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);	   
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        System.out.println(num1/num2);
	    }
        catch(ArithmeticException ex) {
	        System.out.println("Mistake: division by zero");
	    }
        catch(InputMismatchException ex){
	        System.out.println("Mistake: wrong value type");
	    }
	}
}
