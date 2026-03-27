import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter B: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The hypotenuse is %.02f units\n", hypotenuse);
        scanner.close();
    }
}
