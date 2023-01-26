/* Вы являетесь администратором отеля и должны 
создавать карточки с информацией о клиентах для 
своих новых клиентов. На карточке вы должны 
указать имя и фамилию клиента, возраст и номер комнаты.

Предоставленная вам программа принимает данные 
гостя (имя, фамилию, возраст и номер комнаты)
 в качестве входных данных.

Завершите класс, добавив соответствующие 
атрибуты, чтобы метод saveCustomerInfo() 
работал корректно. Также присвоите значения 
взятых данных атрибутам созданного объекта.

Sample Input
John
Smith
35
204

Sample Output
First name: John
Second name: Smith
Age: 35
Room number: 204

Будьте внимательны, чтобы задать правильные типы данных 
для атрибутов.
Be attentive to set correct data types for attributes.
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        customer.saveCustomerInfo(firstName, secondName, age, roomNumber);
    }
}

class Customer 
{
    public void saveCustomerInfo(String fName, String sName, int ag, int rNumber) {
        System.out.println("First name: " + fName);
        System.out.println("Second name: " + sName);
        System.out.println("Age: " + ag);
        System.out.println("Room number: " + rNumber);
    }
}
