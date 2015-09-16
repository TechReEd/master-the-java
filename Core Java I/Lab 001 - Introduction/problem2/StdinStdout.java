package problem2;

import java.util.Scanner;

/**
 * @author bikram_kundu
 * @version 0.0.1
 * @since 2015
 */
public class StdinStdout {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============ Please provide your Input ===========");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("============ Output ======================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scanner.close();
    }
}
