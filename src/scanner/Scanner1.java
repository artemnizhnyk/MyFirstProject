package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedionnoe 2 chisla");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(x * y);

    }
}
