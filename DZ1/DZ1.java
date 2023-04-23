// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Перейти по ссылке, реализовать формулу на Java.

import java.util.Scanner;

public class DZ1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = sc.nextInt();
        sc.close();

        System.out.printf("Треугольное число: %d", TriangularNumber(number));
        System.out.println();
        System.out.printf("Факториал числа %d: %d", number, Factorial(number));
    }


    static int TriangularNumber(int num)
    {
        if (num == 0) return 1;
        if (num == 1) return 1;
        return num + Factorial(num - 1);
    }


    static int Factorial(int num)
    {
        if (num == 0) return 1;
        if (num == 1) return 1;
        return num * Factorial(num - 1);
    }
}
