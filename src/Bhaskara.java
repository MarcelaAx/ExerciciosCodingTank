import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double sqrt = Math.sqrt(delta);

        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);

        System.out.println("A equação é: "+ a + " x^2 " + "+ " + b + " + " + c);
        System.out.println("O valor de delta é: " + delta);
        System.out.println("A raiz zde x1 é: " + x1);
        System.out.println("A raiz zde x2 é: " + x2);

    }
}
