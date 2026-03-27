import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter R: ");
        double a = scanner.nextDouble();
        scanner.nextLine();

        double area = Math.PI * Math.pow(a, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(a, 3);
        double circumference = Math.PI * 2 * a;

        System.out.printf("The circumference is %.02f unit\n", circumference);
        System.out.printf("The area is %.02f unit²\n", area);
        System.out.printf("The volume is %.02f unit³\n", volume);

        scanner.close();
    }
}
