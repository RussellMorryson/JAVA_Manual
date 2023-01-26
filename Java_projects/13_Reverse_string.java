/* Напишите программу, которая принимает строку в 
качестве входных данных и выводит ее обратное значение.
Данный код принимает строку в качестве входных 
данных и преобразует ее в массив символов, 
который содержит буквы строки в качестве ее элементов.

Sample Input:
hello there

Sample Output:
ereht olleh

Вы можете перебирать массив символов, начиная с 
конца, используя arr.length, чтобы получить размер массива.
*/

import java.util.Scanner;
public class Program
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i]);
		}		
	}
}