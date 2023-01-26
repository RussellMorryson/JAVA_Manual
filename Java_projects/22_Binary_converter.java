/* Двоичная система счисления использует только 
две цифры: 0 и 1. Компьютеры работают в двоичном 
формате, что означает, что они хранят данные и 
выполняют вычисления, используя только нули и единицы.

Вам нужно создать программу для преобразования 
целых чисел в их двоичное представление.

Создайте класс конвертера со статическим методом 
toBinary(), который возвращает двоичную версию 
своего аргумента.
Код в main принимает число в качестве входных 
данных и вызывает соответствующий статический метод. 

Убедитесь, что код работает так, как ожидалось.

Sample Input:
42
Sample Output:
101010

Вы можете использовать следующий код для 
преобразования числа в двоичный код:

String binary="";
while(num > 0) {
   binary = (num%2)+binary;
   num /= 2;
}

Приведенный выше код использует цикл для 
преобразования num в двоичный код и сохраняет 
результат в двоичной строке.
*/


import java.util.Scanner;

class Converter {
    public static String toBinary(int num){
        String binary="";
        while(num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}
public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}