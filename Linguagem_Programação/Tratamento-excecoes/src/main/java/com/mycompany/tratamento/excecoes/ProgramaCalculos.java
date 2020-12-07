
package com.mycompany.tratamento.excecoes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProgramaCalculos {
    public static void main(String[] args) {
        Calculadorainss calculadorainss=new Calculadorainss();
        
        Double inss1=calculadorainss.calcularInss(3500.0);
        System.out.println("INSS 1: "+inss1);
        
        //sendo PROATIVO no tratamento das exceções
        try{//bloco try: código que pode lançar exceção
            Double inssLoko=calculadorainss.calcularInss(-500.0);
            System.out.println("INSS loko: "+inssLoko);
        }catch(NullPointerException npe){//bloco que será executado em caso de NullPointerException
            System.out.println("Você informou o salário? "+ npe.getMessage());
        }catch(IllegalArgumentException iae){
            System.out.println("O salário informado está certo? "+iae.getMessage());
        }
        //Tratamento de exceções de forma generica
        try{//bloco try: código que pode lançar exceção
            System.out.println("-ele executará até essa linha, pois a proxima é um erro-");
            Double inssLoko=calculadorainss.calcularInss(-500.0);
            System.out.println("INSS loko: "+inssLoko);
        }catch(Exception ex){
            System.out.println("Deu ruim! "+ex.getMessage());
        }
        
        
        try {
            calculadorainss.cadastrarCalculo("Zé", null);
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar o cálculo "+ex.getMessage());
        }
    } 
}