/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista019;

import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Clube {
    private Integer totalVitorias=0;
    private Integer totalEmpates=0;
    private Integer totalDerrotas=0;
    private Integer totalPontos=0;
    
    void Registrar(Clube clubeX, String  tipo, JLabel vit,JLabel emp, JLabel der, JLabel pnt){
        Integer pontinhos=0;
        if (tipo.equals("vitoria")) {
            clubeX.totalVitorias++;
            totalPontos+=3;
        }
        else if (tipo.equals("empate")) {
            clubeX.totalEmpates++;
            totalPontos+=1;
        }
        else{
            clubeX.totalDerrotas++;
        }
        
        vit.setText(String.format("%d", clubeX.totalVitorias));
        emp.setText(String.format("%d", clubeX.totalEmpates));
        der.setText(String.format("%d", clubeX.totalDerrotas));
        pnt.setText(String.format("%d", clubeX.totalPontos));
    }
}
