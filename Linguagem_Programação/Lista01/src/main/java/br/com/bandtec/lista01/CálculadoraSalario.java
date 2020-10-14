
package br.com.bandtec.lista01;


public class CálculadoraSalario {
    public static void main(String[] args) {
        Double salario=3000.00;
        Double imposto=10.0/100.0;
        Double liquido=(salario-(salario*imposto));
        System.out.println("Se o salário for "+salario+ "e o imposto for de "+imposto+"%, o salário líquido será "+liquido);
    }
}
