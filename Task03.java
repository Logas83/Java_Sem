// В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. 
// По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
// Входные данные:
// Программа получает на вход действительные числа x и y
// Выходные данные:
// Программа должна вывести одно натуральное число.

// Sample Input:
// 10
// 20
// Sample Output:
// 9

import java.util.Scanner;


public class Task03 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        Double x = sc.nextDouble();
        System.out.printf("y: ");
        Double y = sc.nextDouble();
        sc.close();

        int counter = 1;
        while (x < y) 
        {
            x *= 1.1;
            counter++;
        }

        System.out.println(counter);
    }
}
