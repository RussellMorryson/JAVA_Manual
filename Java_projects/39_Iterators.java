/* Данная вам программа объявляет связанный список 
целых чисел, берет у пользователя 5 чисел и добавляет их в него.
Напишите программу для вычисления и вывода суммы этих элементов.

Sample Input
4
3
50
3
8

Sample Output
68

Используйте итератор и его методы для выполнения 
вычисления с использованием цикла while.
*/

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        while(nums.size() < 5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        int sum = 0;

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println(sum);
    }
}