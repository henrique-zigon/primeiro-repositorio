/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista014;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author User
 */
public class Componente {
    Double valor=0.0;
    String frase="";
    String cor="";
    
    
    void Sorteio(JProgressBar b1, JLabel s1){
        Double sorteio1=ThreadLocalRandom.current() .nextDouble(0,100);
        valor=sorteio1;
        
        if (valor<=20) {
            frase="Status: Suave";
            cor="#0c1dfd";
        }
        else if (valor>20 && valor<=70) {
            frase="Status: Atenção";
            cor="#e90cfd";
        }
        else{
            frase="Status: Critico";
            cor="#fd0c0c";
        }
        
        Ajustar( b1,s1);
    }
    void Ajustar(JProgressBar b1, JLabel s1){
        b1.setValue(valor.intValue());
        s1.setText(frase);
        s1.setForeground(Color.decode(cor));
    }
}
