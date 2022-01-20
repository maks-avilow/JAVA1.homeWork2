package HomeWorkApp2;

import javax.print.DocFlavor;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        CheckSumm10to20(6, 8);
        PlusMinus(-9);
        DetermineNumber(15);
        PrintStrings();
        FourthYears(2020);

    }

    // задание 1
    static boolean CheckSumm10to20(int a, int b) {
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

    static void PlusMinus(int d) {


        if (d > 0 || d == 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //задание 3

    static boolean DetermineNumber(int f) {
        if (f < 0) {
            System.out.println("число отрицательное");
            return true;
        } else {
            System.out.println("Число положительное либо ноль");
            return false;
        }

    }

    // задание 4
    public static void PrintStrings() {
        for (int i = 0; i < 3; i++) {
            for (int g = 0; g < 3; g++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // задание 5 не успел разобраться с исключением про 100 и 400 и про год не високосный (
    public static void FourthYears(int s) {
        for (int v = 0; v < 2500; v += 4) {
            if (s == v) {
                System.out.println("год високосный");
                return;
                                 }
            }
                }

            }






















