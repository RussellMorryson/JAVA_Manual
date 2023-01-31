/* Данная вам программа объявляет ArrayList целых чисел.
Завершите программу, чтобы принимать числа в качестве 
входных данных и добавлять их в ArrayList до тех пор, 
пока его размер не станет равен 5. Затем выведите его 
максимальное и минимальное значения.

Sample Input
4
12
3
88
96

Sample Output
96
3

Используйте Collections.max() и Collections.min(), 
чтобы получить максимум и минимум.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}