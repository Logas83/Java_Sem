// Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

// Входные данные:
// Заданы три целых числа а, b, с, где a > b
// Выходные данные:
// Выведите единственное число - ответ на задачу.

// Sample Input:
// 20
// 1
// 2
// Sample Output:
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2


import java.util.Scanner;

public class Task05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("a: ");
        int a = sc.nextInt();
        System.out.printf("b: ");
        int b = sc.nextInt();
        System.out.printf("c: ");
        int c = sc.nextInt();
        sc.close();

        for (int i = a; i >= b; i -= c)
        {
            System.out.println(i);
        }
    }
}
