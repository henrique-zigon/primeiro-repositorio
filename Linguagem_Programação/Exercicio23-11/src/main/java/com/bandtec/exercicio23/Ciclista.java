
package com.bandtec.exercicio23;


public class Ciclista extends Atleta{
    public Ciclista(){
    profissao="Ciclista";
    }

    @Override
    public void treinar() {
       if (this.num_treino==0) {
            System.out.println("Esse atleta já treinou demais");   
        }
        else{
        System.out.println("ciclista treinando muito!!!");
        this.num_treino=this.num_treino-1;
        System.out.println("Treinos restantes: "+this.num_treino);
        }
    }

    @Override
    public void praticar() {
        System.out.println("Ciclista praticando pedal");
    }
    
}
