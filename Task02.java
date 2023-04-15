// Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
// если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

// Входные данные:
// Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
// Выходные данные:
// Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

// Sample Input 1:
// 3 2 4
// Sample Output 1:
// YES


import java.util.Scanner;


public class Task02 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите размер: ");
        String size = sc.nextLine();
        sc.close();

        String[] words = size.split(" ");
        int width = Integer.parseInt(words[0]);
        int height = Integer.parseInt(words[1]);
        int peace = Integer.parseInt(words[2]);
        
        if (peace < width * height && ((peace % height == 0) || (peace % width == 0)))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
