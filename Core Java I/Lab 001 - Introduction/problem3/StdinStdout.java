package problem3;

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
        int x=scanner.nextInt();
        double y=scanner.nextDouble();
        scanner.nextLine();
        String s=scanner.nextLine();
        System.out.println("============ Output ======================");
        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
        scanner.close();
    }
}
