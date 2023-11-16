import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");

        String nome = entrada.nextLine();
        System.out.println("Boa noite, " + nome);
        System.out.println("Qual o seu ano de nascimento? ");
        int anoDeNascimento = entrada.nextInt();
        int idadeNoFinal = 2023 - anoDeNascimento;
        System.out.println("No final de 2023 você terá " + idadeNoFinal + " anos");
    }
}
