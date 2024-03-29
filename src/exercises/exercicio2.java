package exercises;

import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

public class exercicio2 {
    public static void main(String[] args) {
        
        double pi = 3.14159;
        double raio;

        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A=%.4f", area);

        sc.close();
    }
}
