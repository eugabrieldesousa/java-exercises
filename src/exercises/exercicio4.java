package exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        int numeroFuncionario;
        double horasTrabalhadas, valorRecebidoHora, salarioFuncionario;

        Scanner sc = new Scanner(System.in);

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorRecebidoHora = sc.nextDouble();
        salarioFuncionario = horasTrabalhadas * valorRecebidoHora;

        System.out.printf("NUMBER = %d%n SALARY = R$%.2f", numeroFuncionario, salarioFuncionario);
        
    }
}
