/* Интернет-магазин электроники имеет 5 категорий 
товаров - ПК, ноутбуки, планшеты, телефоны и аксессуары.
Данная вам программа объявляет массив и сохраняет 
в нем эти типы.
Напишите программу, которая принимает N чисел в 
качестве входных данных и выводит элемент массива 
с N индексом. Если индекс находится вне диапазона, 
программа должна выдать "Неправильный вариант".

Sample Input
5

Sample Output
Wrong Option

Используйте тип исключения, чтобы перехватить 
все возможные исключения.
*/


import java.util.Scanner;

public class Main{
	public static void main(String[] args) {	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
		try {
	        
			System.out.println(categories[choice]);
	    } catch(Exception e) {
	        System.out.println("Wrong Option");
	    }
	}
}