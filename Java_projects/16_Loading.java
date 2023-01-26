/* Создайте программу, которая будет показывать 
пользователям вашего приложения сообщение о загрузке.
Определите класс Loading, у которого есть один 
открытый метод, называемый LoadingMessage(), 
который должен выводить "Loading" при вызове.
Создайте объект с именем loading и вызовите этот метод.

Не забудьте использовать ключевое слово new при 
создании объекта.
*/

public class Main 
{
   public static void main(String[] args) 
   {  
       Loading.LoadingMessage();
   }
}

class Loading {
    public static void LoadingMessage()
    {
        System.out.print("Loading");
    }
}