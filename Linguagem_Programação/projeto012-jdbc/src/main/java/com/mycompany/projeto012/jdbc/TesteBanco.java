/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto012.jdbc;

import java.util.List;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aluno
 */
public class TesteBanco {
    public static void main(String[] args){
        //Configurando a conexão com banco de dados
        BasicDataSource dataSource=new BasicDataSource();
        //Iniciando a classe do Driver de Banco
        dataSource.setDriverClassName("org.h2.Driver");
        //Iniciando a url do banco
        dataSource.setUrl("jdbc:h2:file:./meubanco");
        
        //login e senha para entrar no banco
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        
        //permite enviar instruções SQL ao banco e converte asm respostas
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        System.out.println(jdbcTemplate.queryForList("select * from PAIS"));
        System.out.println(jdbcTemplate.queryForList("select * from PAIS where nome='Brasil'"));
        
        List<Pais> listaPaises=jdbcTemplate.query(
        "select * from pais", new BeanPropertyRowMapper(Pais.class));
        
        for(Pais pais : listaPaises){
            System.out.println("id: "+pais.getId());
            System.out.println("nome: "+pais.getNome());
        }
        
        System.out.println("Consulta veio vazia? "+listaPaises.isEmpty());
        System.out.println("Qunatas linhas a consulta trouxe?"+listaPaises.size());
        
        
        Integer idConsulta=2;
        List<Pais> consulta1=jdbcTemplate.query("select*from pais where id=?",new BeanPropertyRowMapper(Pais.class),idConsulta);
        System.out.println("Resultado da consulta1:");
        for(Pais pais : consulta1){
            System.out.println("id: "+pais.getId());
            System.out.println("Nome: "+pais.getNome());
        }
        
        Integer idconsulta2=5;
        List<Pais> consulta2=jdbcTemplate.query("select*from pais where id between ? and ?",new BeanPropertyRowMapper(Pais.class),idConsulta,idconsulta2);
        System.out.println("Resultado da consulta1:");
        for(Pais pais : consulta2){
            System.out.println("id: "+pais.getId());
            System.out.println("Nome: "+pais.getNome());
        }
    }
}
