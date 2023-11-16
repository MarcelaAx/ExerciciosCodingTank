import java.util.Scanner;

public class NumeroParEPositivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = ler.nextInt();
        boolean ehPositivo = numero > 0;
        boolean ehNegaivo = numero < 0;
        boolean ePar = numero % 2 == 0;
        boolean eImpar = !ePar;

        if(numero == 0) {
            System.out.printf("O número %s é zero e par;", numero);
        }else if(ehPositivo && ePar){
            System.out.printf("O número %s é positivo e par".formatted(numero));
        }else if(ehPositivo && eImpar) {
            System.out.printf("O número %s é positivo e impar".formatted(numero));
        }else if(ehNegaivo && ePar) {
            System.out.printf("O número %s é negativo e par".formatted(numero));
        } else if (ehNegaivo && eImpar) {
            System.out.printf("O número %s é negativo e impar".formatted(numero));
        }

    }
}
