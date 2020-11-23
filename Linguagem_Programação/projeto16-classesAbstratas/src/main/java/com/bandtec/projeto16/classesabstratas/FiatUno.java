package com.bandtec.projeto16.classesabstratas;

//a classe fiat uno, implementa a classe abstrata carro
public class FiatUno extends Carro{

    public FiatUno() {
        marca="FIAT";
        modelo="Uno";
        cilidradas=1000;
        velocidadeMaxima=100.0;   
    }

    
    
    @Override
    public void trocarMarcha() {
        System.out.println("Trocando marcha no uno e puxando para ré");
    }
    
}
