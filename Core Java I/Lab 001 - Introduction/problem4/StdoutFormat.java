package problem4;

import java.util.Scanner;

/**
 * @author bikram_kundu
 * @version 0.0.1
 * @since 2015
 */
public class StdoutFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============ Please provide your Input ===========");
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d %n", s1, x);
        }
        System.out.println("================================");

        scanner.close();
    }
}
