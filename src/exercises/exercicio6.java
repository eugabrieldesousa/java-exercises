package exercises;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        double a, b, c, areaTrinagulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTrinagulo = a * c / 2;
        areaCirculo = Math.PI * Math.pow(c, 2);
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;
        
        System.out.println("Área do Triângulo: " + areaTrinagulo);
        System.out.println("Área do Círculo: " + areaCirculo);
        System.out.println("Área do Trapezio: " + areaTrapezio);
        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        
    }
}
