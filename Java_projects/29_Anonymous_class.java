/* Вы менеджер магазина.
Вы предлагаете скидку 10% на все товары в магазине. 
Сегодня у вас было в общей сложности два клиента. 
На первый вы получили скидку 10% на все приобретенные 
товары. Однако второй клиент приобрел много товаров, 
и вы хотите предоставить ему большую скидку - 20% - 
чтобы показать свою признательность.

Завершите программу, создав два объекта покупки - 1 
для постоянного клиента и 1 для специального, и 
переопределите метод TotalAmount() для специального 
клиента на лету, чтобы установить соответствующую 
скидку 20%.

Вызовы методов уже даны.
*/

public class Main
{
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();
       Purchase specialCustomer = new Purchase(){
           @Override public int totalAmount (int price) {
               return price - (price*20)/100;
           }
        };        
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
	}
}

class Purchase {
    int price;    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}