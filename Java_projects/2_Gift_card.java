/* Менеджер по продажам решил подарить подарочную карту 
клиентам, общая сумма покупок которых превышает 15000. 
Кроме того, клиенты, общая сумма покупок которых 
превысит 30000, получат вторую подарочную карту.
Вам предоставляется программа, которая принимает 
сумму покупки в качестве входных данных и печатает 
"Подарочную карту", если она превышает 15000.

Введите код для повторной печати "Gift card", 
если сумма покупки превышает 30000.

Sample Input
36000

Sample Output
Gift card
Gift card
*/

import java.util.Scanner;
public class Main 
{
   public static void main(String[] args) 
   {
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();
       
        if(purchases > 15000)
        {
            System.out.println("Gift card");
            if (purchases > 30000)
            {
                System.out.println("Gift card");
            }
        }
    }
}