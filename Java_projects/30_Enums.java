/* Наша видеоигра-шутер имеет 3 варианта сложности - 
ЛЕГКИЙ, СРЕДНИЙ, ЖЕСТКИЙ.
Для каждого уровня сложности у игрока есть соответствующее 
количество пуль.
Программа, которую вам дают, определяет класс игрока и перечисление 
сложности и создает 3 объекта игрока с разными трудностями в 
качестве параметров для конструктора.

Заполните конструктор игрока, который принимает перечисление 
в качестве параметра для проверки количества маркеров для каждого 
варианта сложности и вывода соответствующего сообщения:


EASY => "You have 3000 bullets"
MEDIUM => "You have 2000 bullets"
HARD => "You have 1000 bullets"

Используйте оператор switch для проверки каждого параметра 
перечисления и вывода соответствующего сообщения.

*/


class Main {

    public static void main(String[] args) {
        
        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
   }
}
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

public class Player{
    Player(Difficulty diff){
        switch(diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
        }
    }
}