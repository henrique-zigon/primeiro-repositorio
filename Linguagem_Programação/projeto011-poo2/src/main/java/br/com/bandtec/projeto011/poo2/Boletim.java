/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto011.poo2;

public class Boletim {
    private Double mediaMinima;
    private Double frequenciaMinima;
    
    private Double mediaAtual;
    private Double frequenciaAtual;

    private Boolean aprovado;
    
    public Boletim(Double mediaMinima, Double frequenciaMinima) {
        this.mediaMinima = mediaMinima;
        this.frequenciaMinima = frequenciaMinima;
    }
    
    void Analisar(Double media, Double frequencia){
        this.mediaAtual=media;
        this.frequenciaAtual=frequencia;
        
        if (this.mediaAtual>=this.mediaMinima && this.frequenciaAtual >= this.frequenciaMinima) {
            aprovado=true;
        }
        else{
            aprovado=false;
        }
    }
    
    public Boolean getAprovado(){
        return aprovado;
    }
}
