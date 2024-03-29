// Em seguida, usando os valores das variáveis, produza a
// seguinte saída na tela do console:
// Products:
// Computer, which price is $ 2100,00
// Office desk, which price is $ 650,50
// Record: 30 years old, code 5290 and gender: F
// Measue with eight decimal places: 53,23456700
// Rouded (three decimal places): 53,235
// US decimal point: 53.235

import java.util.Locale;

class Output_values {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        double price1 = 2100;
        double price2 = 650.50;
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double measure = 53.23456700;

        System.out.printf(
                "Products: %n %s, which price is %.2f %n %s, which price is %.2f %n Record: %d years old, code %d and gender: %s %n Measue with eight decimal places: %f %n Rouded (three decimal places): %.3f %n US decimal point: ",
                product1, price1, product2, price2, age, code, gender, measure, measure);
                Locale.setDefault(Locale.US);
                System.out.printf("%.3f", measure);
    }
}