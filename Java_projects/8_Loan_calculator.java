/* Вы берете кредит у друга и вам нужно подсчитать, 
сколько вы будете ему должны через 3 месяца.
Вы собираетесь возвращать ему 10% от оставшейся суммы 
кредита каждый месяц.
Создайте программу, которая принимает сумму кредита в 
качестве входных данных, вычисляет и выводит оставшуюся 
сумму через 3 месяца.

Sample Input:
20000

Sample Output:
14580

Вот график ежемесячных платежей:
Месяц 1
Оплата: 10% от 20000 = 2000
Оставшаяся сумма: 18000
Месяц 2
Оплата: 10% от 18000 = 1800
Оставшаяся сумма: 16200
Месяц 3:
Оплата: 10% от 16200 = 1620
Оставшаяся сумма: 14580

Используйте цикл для расчета платежа и оставшихся сумм 
за каждый месяц.
Кроме того, используйте целые числа для обозначения сумм.
*/

import java.util.Scanner;
public class Program
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int i = 0;		
		while (i < 3) 
		{
			amount = amount - amount * 10 /100;        
			i++;
		}	
		System.out.println(amount);
	}
}