package com.bandtec.projeto16.classesabstratas;

public class ProgramaCarros {
    public static void main(String[] args) {
        //Carro carro1=new Carro();
        //Classes abstratas não podem ser instanciadas 
        
        //UMA CLASSE CONCRETA PODE SER INSTANCIADA
        FiatUno uno1=new FiatUno();
        //podemos declarar como abstrata, porém
        //instaciar como concreta
        Carro uno2=new FiatUno();
        //não podemos instancia classe abstrata
        //FiatUno uno3=new Carro();
        
        
        uno1.trocarMarcha();
        uno2.trocarMarcha();
        
        
        Carro meuA4=new AudioA4();
        meuA4.trocarMarcha();
        
        uno2.abastecer();
        meuA4.abastecer();
    }
    
}
