/* Ваша компания пишет программу для курса геометрии.
Программа принимает количество квадратов в качестве 
первого ввода, создает массив, а затем принимает 
стороны квадратов в качестве своих элементов.
Напишите часть программы, которая получает список 
сторон квадрата и печатает площадь этих квадратов 
для пользователя.

Sample Input
2
3
4

Output
9
16

Объяснение
В этом примере у нас есть 2 квадрата (первый вход) и 
их стороны соответственно - 3 и 4 (второй и третий входы). 
Площадь первого квадрата равна 9 (3*3), второго - 16 (4*4).

Площадь квадрата - это квадрат его ребер.
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        int S = 0;

        for (int i = 0; i < length; i++) 
        {
           sides[i] = scanner.nextInt();
        }
        for (int j = 0; j < length; j++)
        {
            S = sides[j] * sides[j];
            System.out.println(S);
        }
   }
}