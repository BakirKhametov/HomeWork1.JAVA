//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//2 -1 переход - 2 в сумму
//3 -1 переход 3 в сумму
//суммарно выведет 5


package org.example.Seminar1.HW2;

import java.util.Scanner;

public class sumPositive {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int firstNumber = n.nextInt();

        int sum = 0;

        while (firstNumber != 0) {
            int secondNumber = n.nextInt();

            if (secondNumber < 0 && firstNumber > 0) {
                sum = sum + firstNumber;
            }
            firstNumber = secondNumber;
        }
        System.out.println(sum);

    }
}
//public class sumPositive {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int sum = 0;
//        while (x != 0) {
//            int y = scanner.nextInt();
//            if (y < 0) sum += x;
//            else sum += 0;
//            System.out.println(sum);
//        }
//    }
//}