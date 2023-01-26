/* Вы являетесь ассистентом на телешоу, где танцуют 
знаменитости, а 4 судьи оценивают их выступление и 
дают им оценку от 1 до 10.
Программа, которую вам дают, принимает баллы в качестве 
входных данных.
Завершите метод, чтобы принять их в качестве параметров, 
затем вычислите и верните средний балл.

Sample Input
6.0
4.0
5.0
3.0

Sample Output
4.5

Чтобы рассчитать средний балл, сложите все баллы, затем 
разделите на количество набранных баллов.
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
    }
    public static double getAverageScore(double a, double b, double c, double d) 
    {       
       double average = (a + b + c + d) / 4;
       return average;
    }
}