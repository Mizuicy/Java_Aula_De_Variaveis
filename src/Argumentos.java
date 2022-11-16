import java.util.Scanner;

public class Argumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoDeNascimento, anoAtual;

        System.out.println("Coloque seu ano de nascimento ↓");
        anoDeNascimento = scanner.nextInt();

        System.out.println("Coloque aqui o ano atual ↓");
        anoAtual = scanner.nextInt();

        int idade = anoAtual - anoDeNascimento;
        System.out.println(idade);


    }
}
