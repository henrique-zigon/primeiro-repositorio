/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista016;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Dadinho {
    Integer numero=0;
    Integer vitorias=0;
            
    void Sortear(Dadinho dadox,JLabel texto, Integer x){
        Integer sorteio=ThreadLocalRandom.current() .nextInt(1,6);
        dadox.numero=sorteio;
        texto.setText(String.format("Dadinho %d: %d", x,dadox.numero));
    }
    void Comparar(Integer nx, Integer ny,JLabel texto,Dadinho x,Dadinho y ,JLabel vit1,JLabel vit2){
        if (nx>ny) {
            Integer verificador=1;
            texto.setText(String.format("O Dadinho %d venceu", verificador));
            x.vitorias+=1;
            vit1.setText(String.format("Vitórias do Dadinho %d: %d", verificador,x.vitorias));
        }
        else if (nx.equals(ny)) {
            Integer verificador=0;
            texto.setText(String.format("Empate"));
        }
        else{
            Integer verificador=2;
            texto.setText(String.format("O Dadinho %d venceu", verificador));
            y.vitorias+=1;
            vit2.setText(String.format("Vitórias do Dadinho %d: %d", verificador,y.vitorias));
        }
    }
}
