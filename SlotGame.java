import java.util.Random;
import java.util.Scanner;

public class SlotGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance = 100;
        String[] symbols = { "A", "B", "C", "D", "E" };
        String[] machine = { "", "", "" };
        String quite = "";
        do {
            System.out.print("Enter betting amount:");
            int bet = scanner.nextInt();
            scanner.nextLine();
            if (bet < balance) {
                balance -= bet;
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
            for (int i = 0; i < 3; i++) {
                int x = random.nextInt(0, 5);
                machine[i] = symbols[x];
            }
            for (String symbol : machine) {
                System.out.print("|" + symbol + "|");
            }
            System.out.println("");
            if (machine[0].equals("A") == true && machine[1].equals("A") == true && machine[2].equals("A") == true) {
                bet *= 1;
                balance += bet;
            } else if (machine[0].equals("B") == true && machine[1].equals("B") == true
                    && machine[2].equals("B") == true) {
                bet *= 2;
                balance += bet;
            } else if (machine[0].equals("C") == true && machine[1].equals("C") == true
                    && machine[2].equals("C") == true) {
                bet *= 2;
                balance += bet;
            } else if (machine[0].equals("D") == true && machine[1].equals("D") == true
                    && machine[2].equals("D") == true) {
                bet *= 3;
                balance += bet;
            } else if (machine[0].equals("E") == true && machine[1].equals("E") == true
                    && machine[2].equals("E") == true) {
                bet *= 5;
                balance += bet;
            }
            System.out.print("Enter Q to leave:");
            quite = scanner.nextLine().toUpperCase();
        } while (!quite.equals("Q"));
        System.out.println("Balance: " + balance);
        scanner.close();

    }
}
