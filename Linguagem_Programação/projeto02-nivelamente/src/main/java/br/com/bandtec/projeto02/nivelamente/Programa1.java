/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto02.nivelamente;

/**
 *
 * @author User
 */
public class Programa1 {
    public static void main(String[] args) {
        //Em Java usamos linguagem Estatica
        //Diferente do JS, que usa Linguigem DINAMICA
        //ex: variaveis texto(ou alfanumérico): String
        String fruta="abacate";
        String bairro="Vila Prudente";
        //variàveis de número inteiro: Integer
        Integer idade=30;
        Integer filhos=2;
        //variáveis de número Real: Double
        Double altura=1.49;
        Double preco= 87.33;
        //variáveis lógicas (boolena: Boolean)
        Boolean vivo=true;
        Boolean fechado=false;
        Boolean palmeirasMundial=false;
        
        //Conversão de tipos
        String alunosTxt="60";
        //ex: String p/ Integer
        Integer alunos= Integer.valueOf(alunosTxt);
        //ex: String p/ Double
        String mediaTxt="8.75";
        Double media=Double.valueOf(mediaTxt);
    }
}
