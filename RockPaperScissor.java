import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] items = { "R", "P", "S" };
        String quite = "";
        int score = 0;
        do {
            int n = random.nextInt(0, 3);
            System.out.print("Enter:");
            String c = scanner.nextLine();
            String ai = items[n];
            switch (c) {
                case "R":
                    switch (ai) {
                        case "R":
                            System.out.println(ai + " " + c + " " + "Draw");
                            break;
                        case "P":
                            score--;
                            System.out.println(ai + " " + c + " " + "Lose");
                            break;
                        case "S":
                            score++;
                            System.out.println(ai + " " + c + " " + "Win");
                            break;
                        default:
                            System.out.println("wrong");
                            break;
                    }
                    break;
                case "P":
                    switch (ai) {
                        case "R":
                            score--;
                            System.out.println(ai + " " + c + " " + "Lose");

                            break;
                        case "P":
                            System.out.println(ai + " " + c + " " + "Draw");
                            break;
                        case "S":
                            score++;
                            System.out.println(ai + " " + c + " " + "Win");
                            break;
                        default:
                            System.out.println("wrong");
                            break;
                    }
                    break;

                case "S":
                    switch (ai) {
                        case "R":
                            score--;
                            System.out.println(ai + " " + c + " " + "Lose");
                            break;
                        case "P":
                            score++;
                            System.out.println(ai + " " + c + " " + "Win");
                            break;
                        case "S":

                            System.out.println(ai + " " + c + " " + "Draw");
                            break;
                        default:
                            System.out.println("wrong");
                            break;
                    }
                    break;
                default:
                    System.out.println("wrong input by user");
                    break;
            }
            System.out.print("Enter Q to leave:");
            quite = scanner.nextLine().toUpperCase();

        } while (!quite.equals("Q"));
        System.out.println("Score: " + score);
        scanner.close();
    }

}