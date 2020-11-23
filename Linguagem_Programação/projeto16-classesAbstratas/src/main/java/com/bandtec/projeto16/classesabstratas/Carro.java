package com.bandtec.projeto16.classesabstratas;

public abstract class Carro {

    protected String marca;
    protected String modelo;
    protected Integer cilidradas;
    protected Double velocidadeMaxima;
    
    
    //em classes abstratas, podemos criar métodos
    //abstratos, que só possuem assinatura mas não corpo
    public abstract void trocarMarcha();
    
    //classes abstratam podem ter métodos concretos, sem
    //problemas.
    public void abastecer(){
        System.out.println("Injetando combustivel no tanque");
    }
}
