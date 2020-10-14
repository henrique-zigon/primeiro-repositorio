
package br.com.bandtec.projeto02.nivelamente;

public class Programa2 {
    public static void main(String[] args) {
        String passageiro="Zé Buduia";
        Integer viagensDia=4;
        Double creditoBU=119.5;
        
        //considerando que a passagem é 4,40
        Double viagensPossiveis= creditoBU/4.4;
        
        //ex:8.2  -> 8
        //ex:8.99 -> 8
        
        //Recuperando apenas a parte inteira não é ARREDONDAEMNTO
        Integer viagensPossiveisInteiro = viagensPossiveis.intValue();
        System.out.println("pode fazer "+viagensPossiveisInteiro+" viagens");

        // Calcule e exiba para quantos dias a quantidade de crédito no BU ainda é suficiente
        // "A quantidade de crédito dá para X dias de trabalho"(número inteiro)
        
        Integer diasTotais= viagensPossiveisInteiro/viagensDia;
        System.out.println("A quantidade de crédito dá para " +diasTotais+ " dias de trabalho");
    }
}
