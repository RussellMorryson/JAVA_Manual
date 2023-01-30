/* Мы пишем программу регистрации для нашего приложения. 
Сначала он должен приветствовать пользователей, 
затем попросить их ввести свои имена.

Но программа, которую вам дают, выполняет эту 
последовательность в обратном порядке.
Завершите программу, расширив класс Thread для 
классов Welcome и Name, затем установив приоритеты 
для их методов запуска, чтобы программа выводила 
сообщения в правильном порядке.

Используйте метод setPriority(number) для 
объектов - obj.setPriority(number). 
Чем больше число, тем выше приоритет.

*/

class Main {
    public static void main(String[ ] args) {
        Name name = new Name();        
        name.setPriority(2);
        Welcome welcome = new Welcome();
        welcome.setPriority(1);
        name.start();
        welcome.start();
        
    }
}

class Welcome extends Thread{
    public void run() {        
        System.out.println("Welcome!");
    }
}

class Name extends Thread{
    public void run() {        
        System.out.println("Please enter your name");
    }
}