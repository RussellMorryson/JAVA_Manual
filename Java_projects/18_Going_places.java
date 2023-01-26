/* Вы тур-менеджер, и у вас должен быть список стран 
вместе с их столицами.
Вам дается программа, которая создает объект Country, 
и вы должны вывести название и столицу, но что-то 
идет не так.

Задача
Измените модификаторы доступа к полям класса страны, 
чтобы выполнить требуемый вывод.

Используйте модификатор общего доступа, чтобы 
предоставить доступ к любым другим классам.

*/

public class Program
{
	public static void main(String[] args) 
	{
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
}
	
}
class Country
{
    public String name;
    public String capital;
}