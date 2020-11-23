
package com.bandtec.exercicio23;


public class Nadador extends Atleta{
    public Nadador(){
    profissao="Nadador";
    }

    @Override
    public void treinar() {
        if (this.num_treino==0) {
            System.out.println("Esse atleta já treinou demais");   
        }
        else{
        System.out.println("nadador treinando muito!!!");
        this.num_treino=this.num_treino-1;
        System.out.println("Treinos restantes: "+this.num_treino);
        }
    }

    @Override
    public void praticar() {
        System.out.println("Nadador praticando muito");
    }
}
