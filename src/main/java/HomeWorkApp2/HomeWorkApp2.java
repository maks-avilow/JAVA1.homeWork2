package HomeWorkApp2;

import javax.print.DocFlavor;
/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class HomeWorkApp2 {

    public static void main(String[] args) {

        checkSumm10to20(6,8);
        plusMinus(-9);
        determineNumber(15);
        printStrings();
        fourthYears(2020);

    }

    // задание 1
    static boolean checkSumm10to20(int a, int b) {
        int c = a + b;
        if (c < 20 && c > 10 || c == 20) {
            System.out.println("сумма лежит в пределах от 10 до 20");
            return true;
        } else {

            System.out.println("сумма не лежит в пределах от 10 до 20");
            return false;
        }
    }

    //задание 2

    static void plusMinus(int d) {


        if (d > 0 || d == 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //задание 3

    static boolean determineNumber(int f) {
        if (f < 0) {
            System.out.println("число отрицательное");
            return true;
        } else {
            System.out.println("Число положительное либо ноль");
            return false;
        }

    }

    // задание 4
    public static void printStrings() {
        for (int i = 0; i < 3; i++) {
            for (int g = 0; g < 3; g++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // задание 5 не успел разобраться с исключением про 100 и 400 и про год не високосный (
    public static void fourthYears(int s) {
        for (int v = 0; v < 2500; v += 4) {
            if (s == v) {
                System.out.println("год високосный");
                return;
                                 }
            }
                }

            }






















