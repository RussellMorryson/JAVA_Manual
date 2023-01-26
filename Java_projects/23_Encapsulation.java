/* Вам нужна программа для управления поступлением в 
художественную школу. Ученики могут быть приняты в 
школу, если они старше 6 лет.
Вам дается программа, которая объявляет класс ученика.

Задача
Завершите метод настройки класса ученика. Если значение 
параметра a больше 6, присвоите ему атрибут age и 
выведите "Добро пожаловать" - "Welcome".

В противном случае выведите "Извините" - "Sorry".

Sample Input
7

Sample Output
Welcome

Используйте оператор if для проверки упомянутого условия.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
	    Scanner read = new Scanner(System.in);
	    int a = read.nextInt();
	    
	    Pupil pupil =  new Pupil();
            pupil.setAge(a);
	}
}

class Pupil
{
    private int age;
    public void  setAge(int a)
    {
       if (a > 6)
       {
           System.out.println("Welcome");
       }
       else {
           System.out.println("Sorry");
       }
    }    
    public int getAge()
    {
        return age;
    }
}