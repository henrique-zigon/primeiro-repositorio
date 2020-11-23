
package com.bandtec.projeto16.classesabstratas;

//a classe audioa4, implementa a classe abstrata carro
public class AudioA4 extends Carro{

    public AudioA4() {
        marca="Audio";
        modelo="A4";
        cilidradas=2200;
        velocidadeMaxima=270.0;   
    }

    
    @Override
    public void trocarMarcha() {
        System.out.println("Trocando marcha no A4 com borboletas no valonte");
    }
    
}
