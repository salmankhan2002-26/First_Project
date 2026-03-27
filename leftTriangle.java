import java.util.Scanner;
//import java.util.Random;

public class leftTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quit;
        do {
            System.out.print("Enter n:");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - 1 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
            System.out.print("Enter Q to quit:");
            quit = scanner.next().toUpperCase();
        } while (!quit.equals("Q"));
        scanner.close();
    }

}
