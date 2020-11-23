
package com.bandtec.projeto17.estaticos;


public class Cidadao {
    //quando um atributo é static, chamamos ele de atributo de classe
    public static String NACIONALIDADE="brasileito(a)";
    //atributo de classe
    public static Integer IDADE_MINIMA_VOTACAO=16;
    //maraca-lo com final, o torna imutavel ou CONSTANTE
    public static final String HINO="Ouvuram do Ipiranga";
    
    private String nome;
    //O "final" tembém pode estar em parâmetros de métodos e em variaveis
    //locais(criadas dentro dos métodos).Nesse caso tembém são constantes 
    //(ou imutaveis)
    public void setNome(final String nome) {
        System.out.println("Mais um brasileiro ganhando nome: "+nome);
        //nome="Marcelo Ramos";
        //a instrução acima nao compila, pois nome é imutável
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    //Convenção para nomes de atributos de classe é SNAKE_CASE_UPPER_CASE
    //tudo caixa alta e separado por inderline

    
    //métodos estaticos não precisam de instancias para serem invocados
    //e não manipulam atributos de instancias internamente
    public static void pagarImpostoRenda(){
        System.out.println("pagando absurdo de imposto");
    }
}
