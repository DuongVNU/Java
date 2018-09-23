package bai1_tuan3;

import java.util.Scanner;

public class bai_1 {
    private int a1, b1;
    private int a2;
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        bai_1 UCLL = new bai_1();
        UCLL.greatestCommonDivisor();
        System.out.print("Fibonaci of " + UCLL.a2 + ": " + UCLL.fibonaci(UCLL.a2));
    }

    private void greatestCommonDivisor() {
        System.out.print("Enter first number: ");
        this.a1 = cin.nextInt();
        if (this.a1 < 0) {
            this.a1 = -this.a1;
        }


        System.out.print("Enter second number: ");
        this.b1 = cin.nextInt();
        if(this.b1 < 0){
            this.b1= - this.b1;
        }
        while (a1 != b1) {
            if (a1 > b1) {
                a1 = a1 - b1;
            } else {
                b1 = b1 - a1;
            }
        }
        System.out.print("Ước chung lớn nhất là: " + a1 + "\n");
        System.out.print("Enter number fibonaci: ");
        this.a2 = cin.nextInt();

    }

    private int fibonaci(int n) {
        if (n <= 1)
            return n;
        return fibonaci(n - 1) + fibonaci(n - 2);

    }
}
