/*Вам дана матрица 3х3 с числами:

Выведите числа массива, каждое в новой строке.
Подсказка: вам нужно использовать два вложенных 
цикла for для перебора массива.
*/
public class Main {
    public static void main(String[] args) {
         int[][] matrix = {
                 {8, 1, 6},
                 {3, 5, 7},
                 {4, 9, 0},
         };
         int length = matrix.length;     
         for (int i = 0; i < length; i++)
         {
             for (int j = 0; j < length; j++)
             {
                 System.out.println(matrix[i][j]);
             }
         }
        
    }
 }