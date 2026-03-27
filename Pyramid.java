import java.util.Scanner;
//import java.util.Random;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quit;
        do {
            System.out.print("Enter n:");
            int n = scanner.nextInt();
            int s = 0;
            int c = n + (n - 1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < c; j++) {
                    int x = n - 1 - i;
                    int y = c - x - 1;
                    if (s == 0) {
                        if (j < x || j > y) {
                            System.out.print(" ");
                        } else if (j % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {

                        if (j < x || j > y) {
                            System.out.print(" ");
                        } else if (j % 2 == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }

                    }

                }
                // chng switch
                switch (s) {
                    case 0:
                        s = 1;
                        break;

                    case 1:
                        s = 0;
                        break;
                }
                System.out.println("");
            }
            System.out.print("Enter Q to quit:");
            quit = scanner.next().toUpperCase();
        } while (!quit.equals("Q"));
        scanner.close();
    }

}
