// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
// Элементы нужно выводить в том порядке, в котором они встречаются в списке.

// Входные данные:
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные:
// Выведите ответ на задачу.

// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1


import java.util.Scanner;


public class Task07
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
            
        }
    }
}
