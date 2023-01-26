/* Вы создаете банковскую систему безопасности. 
Пользователь должен ввести правильный пароль, 
чтобы получить доступ к платежам.
Пароль - 8819.

Напишите программу, которая будет непрерывно 
принимать пароль в качестве входного и выводить 
Write password, пока клиент не введет правильный пароль.
*/

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
	    Scanner read = new Scanner(System.in);
        int password;
        do 
        {
            System.out.println("Write password"); 
            password = read.nextInt();         
        }
        while(password != 8819);
    }
}