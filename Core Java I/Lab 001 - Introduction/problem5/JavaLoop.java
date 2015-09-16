package problem5;

import java.util.Scanner;

/**
 * @author bikram_kundu
 * @version 0.0.1
 * @since 2015
 */
/*
 * In this problem you will test your knowledge of Java loops. Given three
 * integers a, b, and n, output the following series:
 * a+2^0b,a+2^0b+2^1b,......,a+2^0b+2^1b+...+2^(n−1)b
 *
 * 0≤a,b≤50 1≤n≤15
 */
public class JavaLoop {

    public static void main(String[] args) {
        System.out.println("============= Provide the below details ============");
        System.out.println("Enter value of t: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b: ");
            int b = scanner.nextInt();
            System.out.println("n: ");
            int n = scanner.nextInt();
            System.out.println("\n========= Printing pattern" + (i + 1) + " =====");
            for (int j = 0; j < n; j++) {
                a = (int) (a + Math.pow(2, j) * b);
                System.out.print(a + "\t");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
