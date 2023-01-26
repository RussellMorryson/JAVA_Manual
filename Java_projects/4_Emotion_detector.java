/* Ваш робот может распознавать ваши эмоции, помеченные 
номером, который представляет каждую из них:
1 - You are happy!
2 - You are sad!
3 - You are angry!
4 - You are surprised!
Напишите программу, которая принимает номер эмоции в 
качестве входных данных и выводит соответствующее 
сообщение в заданном формате.
Если входные данные представляют собой эмоцию, которую 
программа не знает, она должна вывести: "Неизвестная эмоция"..

Sample input
1

Sample output
You are happy!

Не забывайте о заявлении о разрыве (break).
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
        switch (emotion) 
        {
            case 1: System.out.println("You are happy!");
                break;
            case 2: System.out.println("You are sad!");
                break;
            case 3: System.out.println("You are angry!");
                break;
            case 4: System.out.println("You are surprised!");
                break;
            default: System.out.println("Unknown emotion.");
                break;
        }
    }
}