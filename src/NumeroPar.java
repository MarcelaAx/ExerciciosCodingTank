import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        int resto = numero %2;
        System.out.println(resto);
        boolean ehPar = resto ==0;

        if(ehPar) {
            System.out.println("O número " + numero + " é par");
    }else {
            System.out.println("O númeor " + numero + " é impar");
        }
    }
}
