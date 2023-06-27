package ru.madykhan.api.lesson1;

import java.io.IOException;
import java.util.Scanner;

public class Program {
/*
*Вывести все простые числа от 1 до 1000 
*/
//     public static void main(String[] args) {
//         try (Scanner tru = new Scanner(System.in)) {
//             int number;
//             System.out.println("Enter number");

//             for (int i = 2; i <= 100; i++) {
//                 System.out.println(i % 1 == 0 || i % i == 0);
//             }
//         }       
//     }


/*
*Вычислить n-ое треугольного число (сумма чисел от 1 до n),
* n! (произведение чисел от 1 до n) 
*/
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Введите число n: ");
    //     int n = scanner.nextInt();
    //     long sumN = 0;
    //     for (int i = 1; i <= n; i++) {
    //         sumN = sumN + i;
    //         }
    //     System.out.println("Сумма первых n натуральных чисел: " + sumN);
    // }


/*Реализовать простой калькулятор */

    public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите два цифра: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nВыберите функцию (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Некорректный ввод");
            return;
      }
      System.out.print("\nПоказать результат:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}   
