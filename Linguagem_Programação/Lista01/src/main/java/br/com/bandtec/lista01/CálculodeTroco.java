
package br.com.bandtec.lista01;


public class CálculodeTroco {
    public static void main(String[] args) {
        Integer produto=5;
        Integer quant=2;
        Integer dinheiro=20;
        Integer troco=dinheiro-(produto*quant);
        System.out.println("Seu troco será de R$"+troco);
    }
}
