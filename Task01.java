// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
// На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a > b. Программа должна вывести одно натуральное число.
//
// Sample Input 1:
// 10
// 3
// 2
//
// Sample Output 1:
// 8

import java.util.Scanner;

class MyProgram
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите высоту шеста: ");
        int h = iScanner.nextInt();
        System.out.printf("На сколько метров поднимается днём: ");
        int a = iScanner.nextInt();
        System.out.printf("На сколько метров спускается ночью: ");
        int b = iScanner.nextInt();
        iScanner.close();

        int start = 0;
        int counter = 1;

        do
        {
            counter++;
            start = start + a - b;
        }
        while (start + a < h);

        System.out.printf("На %d день улитка доползёт до вершины шеста", counter);
    }
}