/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista018;

import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Elevador {
    Integer pesoTotal=0;
    Integer pessoasTotal=0;
    
    
    
    void Entrar(Elevador elev,JLabel totalKg,JLabel totalP, Integer tipo){
        if (tipo==1){
            elev.pesoTotal+=90;
        }
        else if (tipo==2) {
            elev.pesoTotal+=65;
        }
        else{
            elev.pesoTotal+=40;
        }
        elev.pessoasTotal++;
        totalKg.setText(String.format("%d", elev.pesoTotal));
        totalP.setText(String.format("%d", elev.pessoasTotal));
    }
}
