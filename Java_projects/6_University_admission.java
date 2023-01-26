/* Вам дается код, который принимает в качестве 
входных данных количество студентов, поступающих 
в университет. Давайте поприветствуем их!

Завершите программу, чтобы вывести "Welcome" 
для каждого студента

Sample Input
2

Sample Output
Welcome
Welcome

Запомните точку с запятой (;) после 
инициализации и условие в синтаксисе.
*/

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int i = 0; 
        while (i < n)
        {
            System.out.println("Welcome");
            i++;       
        }       
	}
}