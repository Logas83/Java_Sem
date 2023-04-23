// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить
// .
// .

import java.util.Scanner;


public class DZ3
{
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("--------Супер Калькулятор--------");
            System.out.println("Что будем делать?");
            System.out.println("1 - Считать");
            System.out.println("2 - Выйти");
            System.out.print("Ваш выбор: ");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            

            
            if (choose == 1)
            {
                System.out.println("Введите первое число: ");
                int number1 = sc.nextInt();
                System.out.println("Введите второе число: ");
                int number2 = sc.nextInt();

                System.out.println("Выберите арифметическую операцию:");
                System.out.println("1 - сложение");
                System.out.println("2 - вычитание");
                System.out.println("3 - умножение");
                System.out.println("4 - деление");
                System.out.print("Ваш выбор: ");
                int action = sc.nextInt();                               

                switch (action) 
                {
                    case 1:
                        System.out.println(number1 + number2);
                        break;
                    case 2:
                        System.out.println(number1 - number2);
                        break;
                    case 3:
                        System.out.println(number1 * number2);
                        break;
                    case 4:
                        System.out.println(number1 / number2);
                        break;
                
                    default:
                        System.out.println("Неправильный ввод");
                        break;
                }
            }
            else if (choose == 2)
            {
                break;
            }
            else System.out.println("Неправильный ввод");
                    
            
        } 
    }   
}
