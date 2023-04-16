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
        System.out.print("Сколько чисел будем вводить?: ");
        int size = sc.nextInt();
              
        int[] arr = new int[size];     

        for (int i = 0; i < size; i++)
        {
            System.out.print("Введите число: ");
            arr[i] = sc.nextInt();            
        }

        System.out.println();
        unique_elements(arr);
        sc.close();
    }


    static void unique_elements(int[] arr) {
        System.out.print("Уникальные элементы: ");
        for (int k : arr) {
            int counter = 0;
            for (int i : arr) {
                if (k == i) counter++;
            }
            if (counter == 1) System.out.printf("%d ", k);
        }
    }
}
