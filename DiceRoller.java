import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String quite = "";
        do {
            System.out.print("enter:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice <= 0) {
                System.out.println("It has to be larger than 0");
            } else {
                int total = 0;
                for (int i = 1; i <= choice; i++) {
                    int r = random.nextInt(0, 101);
                    if (r < 30) {
                        r = 1;
                    } else if (r < 50) {
                        r = 2;
                    } else if (r < 70) {
                        r = 3;
                    } else if (r < 90) {
                        r = 4;
                    } else if (r < 95) {
                        r = 5;
                    } else if (r < 100) {
                        r = 6;
                    } else {
                        System.out.println("Error");
                    }

                    total += r;
                    printDie(r);
                }
                System.out.println("Total: " + total);
            }
            System.out.print("Enter Q to exit:");
            quite = scanner.next().toUpperCase();
        } while (!quite.equals("Q"));
        System.out.println("Complete");
        scanner.close();
    }

    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """;

        String dice3 = """
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                """;

        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;

        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;

        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
