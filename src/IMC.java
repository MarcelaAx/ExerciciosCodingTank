import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a sua altura em metros: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe o seu peso em Kg: ");
        double peso = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.3f", imc);

    }
}
