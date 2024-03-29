package exercises;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

public class exercicio1 {
    
    public static void main(String[] args) {
        
        int primeiroValor, segundoValor;

        Scanner sc = new Scanner(System.in);

        primeiroValor = sc.nextInt();
        segundoValor = sc.nextInt();

        int soma = primeiroValor + segundoValor;

        System.out.printf("SOMA = %d", soma);
    }
}
