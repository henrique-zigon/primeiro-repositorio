/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista0110;

import javax.swing.JLabel;


public class Conta {
    Double saldo=0.0;
    Integer qntDeposito=0;
    Integer qntSaque=0;
    
    void Depositar(JLabel saldo1, JLabel deposito, JLabel saque){
        qntDeposito++;
        saldo=saldo+1500;
        Atualizar(saldo,qntDeposito,qntSaque,saldo1,deposito,saque);
    }
    
    void Sacar(JLabel saldo1, JLabel deposito, JLabel saque){
        qntSaque++;
        saldo=saldo-50.0;
        Atualizar(saldo,qntDeposito,qntSaque,saldo1,deposito,saque);
    }
    
    void Atualizar(Double sald,Integer qntDep, Integer qntSa,JLabel lbsal,JLabel lbdep, JLabel lbsa){
        lbsal.setText(String.format("R$ %.2f", sald));
        lbdep.setText(String.format("%d", qntDep));
        lbsa.setText(String.format("%d", qntSa));
    }
}
