/* Компания по производству настольных игр каждый год 
создает новые настольные игры. Хотя все игры имеют 
разные правила, все они также похожи тем, что у 
каждой из них есть название и метод play().

Нам нужно создать 3 разные игры - Монополию, шахматы и Линкоры.

В методе play() 
Монополия должна печатать “Купить все имущество.”, 
Линкоры - “Потопить все корабли.”, а 
шахматы - “Убить вражеского короля”.
Завершите код, реализовав методы getName() и play(), 
унаследованные от абстрактного игрового класса.

Чтобы дать название играм, просто верните строку 
имени внутри функции getName().
*/

class Main {
    public static void main(String[] args) {
        //do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        
        monopoly.play();
        chess.play();
        battleships.play();
    }
 }
 
 abstract class Game {
    abstract String getName();
    abstract void play();   
 }
 
 class Monopoly extends Game {
    String getName() {
       String name = "Monopoly";
       return name;
    }
    void play() {
        System.out.println("Buy all property.");
    }
 }
 
 class Chess extends Game {
    String getName() {
       String name = "Chess";
       return name;
    }         
    void play() {
        System.out.println("Kill the enemy king.");
    }   
 }
 
 class Battleships extends Game {
    String getName() {
       String name = "Battleships";
       return name;
    }
    void play() {
        System.out.println("Sink all ships.");
    }   
 }