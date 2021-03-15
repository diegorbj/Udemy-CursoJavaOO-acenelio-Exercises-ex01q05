package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int peca = sc.nextInt();
        int quantidade = sc.nextInt();
        double precoUnitario = sc.nextDouble();

        double total = quantidade * precoUnitario;

        peca = sc.nextInt();
        quantidade = sc.nextInt();
        precoUnitario = sc.nextDouble();

        total += quantidade * precoUnitario;

        System.out.printf("VALOR A PAGAR R$ %.2f%n", total);

        sc.close();
    }
}
