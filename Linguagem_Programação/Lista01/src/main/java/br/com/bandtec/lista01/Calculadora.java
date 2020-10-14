package br.com.bandtec.lista01;
public class Calculadora {
    public static void main(String[] args) {
        Double num1=21.0;
        Double num2=10.5;
        
      
        
        System.out.println(String.format("Resultado da soma: \n %.1f", (num1+num2)));
        System.out.println(String.format("Resultado da subtração: \n %.1f", (num1-num2)));
        System.out.println(String.format("Resultado da multiplicação: \n %.1f", (num1*num2)));
        System.out.println(String.format("Resultado da divisão: \n %.1f", (num1/num2)));
    }
}
