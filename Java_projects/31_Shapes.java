/* Вы работаете над графическим приложением, которое включает 
в себя несколько различных форм.
Данный код объявляет базовый класс Shape с абстрактным методом 
area() и атрибутом width.

Вам нужно создать два подкласса Shape, Square и Circle, которые 
инициализируют атрибут width с помощью своего конструктора и 
определяют свои методы area().

Функция area() для класса Square должна выводить площадь квадрата 
(квадрат ширины), в то время как для Circle она должна выводить 
площадь заданного круга (PI*width*width).

Код в main создает два объекта с заданным пользовательским вводом 
и вызывает методы area().

Sample Input:
5
2

Sample Output:
25
12.56


Площадь квадрата равна 5*5=25, в то время как площадь 
круга равна PI*2*2=12,566370614359172

Используйте Math.PI для вычисления площади окружности.
*/

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area(int width);
}

class Square extends Shape {
    public void area(int num) {
        int area = num * num;               
        System.out.println(area);
    }
}

class Circle extends Shape {
    public void area(int num) {
        double area = Math.PI * num * num;               
        System.out.println(area);
    }
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square();
        Circle b = new Circle();
        a.area(x);
        b.area(y);
    }
}