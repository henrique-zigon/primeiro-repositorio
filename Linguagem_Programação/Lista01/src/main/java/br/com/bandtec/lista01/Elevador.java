
package br.com.bandtec.lista01;


public class Elevador {
    public static void main(String[] args) {
        Double pesoMax=400.00;
        Integer pessoaMax=5;
        
        Double pessoa1=40.5;
        Double pessoa2=60.00;
        Double pessoa3=52.00;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "+pessoaMax+ "pessoas");
        System.out.println("O peso total no elevador é de " +(pessoa1+pessoa2+pessoa3)+ ", sendo que ele suporta "+pesoMax);
        
        
    }
}
