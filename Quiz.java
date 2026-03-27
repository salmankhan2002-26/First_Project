import java.util.Scanner;
//import java.util.Random;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        String[] questions = { "What is the name of the capital of Bangladesh?",
                "What is the national animal of Bnagladesh?", "Which one is the year of freedom war of Bangladesh?",
                "What is the national fruit of Bnagladesh?" };
        String[][] options = { { "Dhaka", "Sylhet", "Chittagong", "Rangpur" },
                { "Royal bengal tiger", "Zebra", "Cow", "Eagle" }, { "1952", "1969", "1945", "1971" },
                { "Mango", "Kiwi", "Jackfruit", "Orange" } };
        int[] answers = { 0, 0, 3, 2 };
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < questions.length; j++) {
                if (j == 2) {
                    System.out.println("");
                }
                System.out.print(j + 1 + ". " + options[i][j] + "   ");
            }
            System.out.println("");
            System.out.print("Enter answer:");
            int a = scanner.nextInt() - 1;
            scanner.nextLine();
            if (a > 3) {
                System.out.println("Invalid answer.");
                break;
            }
            if (a == answers[i]) {
                score++;
            }
            System.out.println("");
        }
        System.out.println("Score: " + score);
        scanner.close();
    }

}
