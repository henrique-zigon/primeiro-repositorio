
package com.bandtec.exercicio23;


public abstract class Atleta {
    protected String profissao;
    protected Integer num_treino=10;
     
    public void aquecer(String atletaDaVez){
        System.out.println(atletaDaVez+" aquecendo");
    }
    
    public void alongar(String atletaDaVez){
        System.out.println(atletaDaVez+" alongando");
    }
    public void hidratar(String atletaDaVez){
        System.out.println(atletaDaVez+" se hidratando");
    }
    public void gritar(){
        System.out.println("O importante é competir");
    }
    //---------------------------------ABSTRATOS
    public abstract void treinar();
    public abstract void praticar();
}
