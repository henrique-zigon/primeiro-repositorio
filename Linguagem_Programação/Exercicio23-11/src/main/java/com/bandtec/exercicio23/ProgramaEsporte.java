/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bandtec.exercicio23;

/**
 *
 * @author Aluno
 */
public class ProgramaEsporte {
    public static void main(String[] args) {
        Ciclista ciclista=new Ciclista();
        Maratonista maratonista=new Maratonista();
        Nadador nadador=new Nadador();
        Velocista velocista=new Velocista();
        
        ciclista.alongar(ciclista.profissao);
        ciclista.aquecer(ciclista.profissao);
        ciclista.praticar();
        ciclista.treinar();
        System.out.println("------------------------------------");
        maratonista.alongar(maratonista.profissao);
        maratonista.aquecer(maratonista.profissao);
        maratonista.praticar();
        maratonista.treinar();
        System.out.println("------------------------------------");
        nadador.alongar(nadador.profissao);
        nadador.aquecer(nadador.profissao);
        nadador.praticar();
        nadador.treinar();
        System.out.println("------------------------------------");
        velocista.alongar(velocista.profissao);
        velocista.aquecer(velocista.profissao);
        velocista.praticar();
        velocista.treinar();
        System.out.println("------------------------------------");
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        velocista.treinar();
        System.out.println("------------------------------------");
        ciclista.gritar();
        maratonista.gritar();
        nadador.gritar();
        velocista.gritar();
    }
}
