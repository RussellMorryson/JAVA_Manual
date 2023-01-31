// Игра в боулинг

/* Вы создаете игру в боулинг!
Данный код объявляет класс Bowling с его конструктором 
и методом addPlayer().

У каждого игрока игры есть имя и очки, которые 
хранятся в хэш-карте игроков.

Код в main принимает данные 3 игроков в качестве 
входных данных и добавляет их в игру.

Вам нужно добавить в класс метод getWinner(), 
который вычисляет и выводит имя игрока с максимальным 
количеством очков.

Sample Input:
Dave 42
Amy 103
Rob 64

Sample Output:
Amy

Вам нужно выполнить итерацию по хэш-карте, чтобы 
найти элемент с максимальным количеством точек и 
вывести соответствующий ему ключ.

*/

import java.util.*; 

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner() {
        int MaxValue = (Collections.max(players.values()));
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() == MaxValue) {
                System.out.println(entry.getKey());
            }
        }        
    }
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}