/* Ваш друг работает кассиром в кинотеатре. 
Он знает, что вы потрясающий java-разработчик, 
поэтому он попросил вас помочь ему и создать 
программу, которая получает информацию о 
названии фильма, ряду и месте и распечатывает 
новый билет.

Дополните существующий код, добавив конструктор 
в класс Ticket, чтобы его можно было правильно 
инициализировать.

Sample Input
Jaws
5
1

Sample Output
Movie: Jaws
Row: 5
Seat: 1

Вы можете определить параметры конструктора, 
посмотрев на типы вводимых данных.
*/


import java.util.Scanner;

class Main 
{
   public static void main(String[] args) 
   {
       Scanner read = new Scanner(System.in);
       
       String movie = read.nextLine(); // ввод названия фильма
       int row = read.nextInt(); // ввод номера ряда
       int seat = read.nextInt(); // вво дномера места

       Ticket ticket = new Ticket();   
       ticket.movie = movie;
       ticket.row = row;
       ticket.seat = seat;

       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}

class Ticket {
    public String movie;
    public int row;
    public int seat;


   /* 
   private String movie;
   private int row;
   private int seat;
   */

   /*public Ticket(String movie, int row, int seat) 
   {
        String movie;
        int row;
        int seat;
   }*/

   public String getMovie() 
   {
       return movie;
   }

   public int getRow() 
   {
       return row;
   }

   public int getSeat() 
   {
       return seat;
   }
}