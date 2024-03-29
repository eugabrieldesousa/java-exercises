package exercises;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

public class exercicio5 {

    public static void main(String[] args) {

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        float total, valorPeca1, valorPeca2;

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        codigoPeca1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        codigoPeca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorPeca1 = sc.nextFloat();
        valorPeca2 = sc.nextFloat();

        total = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: %.2f\n", total);
    }
}
