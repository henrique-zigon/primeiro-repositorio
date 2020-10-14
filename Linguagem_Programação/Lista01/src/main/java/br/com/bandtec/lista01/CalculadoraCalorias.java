
package br.com.bandtec.lista01;


public class CalculadoraCalorias {
    public static void main(String[] args) {
        Integer tempoAque=10;
        Integer tempoAer=20;
        Integer tempoMusc=10;
        
        Integer tempTotal=(tempoAque+tempoAer+tempoMusc);
        
        Integer calo1=10*12;
        Integer calo2=20*20;
        Integer calo3=10*25;
        
        Integer caloTotal=(calo1+calo2+calo3);
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", tempTotal,caloTotal));
    }
}
