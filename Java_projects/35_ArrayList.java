/* Данная вам программа объявляет список массивов с 
четными числами.
Напишите программу, которая принимает числа в качестве 
входных данных и добавляет их в ArrayList, пока размер 
ArrayList не равен 3.

Затем вычислите и выведите среднее значение всех значений 
в целых числах.

Sample Input
5
2
4


Sample Output
3

Используйте evennums.size() в состоянии цикла while.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        while(evennums.size()<3){
            int num = scanner.nextInt();
            evennums.add(num);
        }
        int sum = 0;
        int average = 0;
        for (int i = 0; i < evennums.size(); i++) {
            sum += evennums.get(i);
        }
        average = sum / evennums.size();
        System.out.println(average);
    }
}