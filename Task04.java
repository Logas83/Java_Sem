// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120


import java.util.Scanner;


public class Task04 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("n: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n)
    {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
