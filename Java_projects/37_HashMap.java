/* Данная вам программа определяет и выводит хэш-карту, 
где имена сотрудников хранятся в виде ключей, а их 
возраст - в виде значений.
Он также принимает N-число от пользователя в качестве 
возрастного ограничения. Напишите код для удаления 
всех сотрудников, возраст которых меньше N-го числа.
Строка кода для вывода объекта HashMap уже предоставлена.

Sample Input
25

Sample Output
{Robert=32, John=28}

Подсказка
Используйте метод get() для доступа к значениям в 
HashMap и remove() для их удаления.

nameArr - это массив заданных ключей HashMap, созданный 
для итерации.
*/

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);  
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            if (ages.get(emp) < ageLimit) {
                ages.remove(emp);
            }
        }
        System.out.println(ages);
    }
}