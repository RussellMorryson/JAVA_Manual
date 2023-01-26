/* Ваша календарная программа должна выводить 
все дни недели, но в ней есть ошибки.
Измените код так, чтобы программа печатала дни.

Обратите внимание, что мы используем литерал 
массива, потому что мы уже знаем все элементы 
массива, который мы собираемся создать.

*/

public class Main {

    public static void main(String[] args) {
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
 
        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);
        }
    }
 }