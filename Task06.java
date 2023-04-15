// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. 
// А потом выведите числа, которые суммировались.

// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3

import java.util.Scanner;


public class Task06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("size array: ");
        int size = sc.nextInt();
        

        int[] arr = new int[size];
        int sum_nums = 0;

        for (int i = 0; i < size; i++)
        {
            System.out.println("elem: ");
            arr[i] = sc.nextInt();
            if (i % 2 == 0)
            {
                sum_nums += arr[i];
            }
        }
        sc.close();
        System.out.println(sum_nums);

        for (int i = 0; i < size; i += 2)
        {
            System.out.println(arr[i]);
        }
    }
}
