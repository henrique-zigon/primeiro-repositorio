package br.com.bandtec.projeto14.heranca.modelos;


public class PaiRico {
    //Atributos privados não são herdados pelas subclasses
    //Para herdar esse atributo e ser "meio privado" usamos protected
    //O protected permite acesso em classes do mesmo pacote.
    protected String nome;
    
    //Quando a super classe tem um construtor, sua subclasse deve ter também
    public PaiRico(String nome) {
        this.nome = nome;
    }
 
    //Quando o metodo ou atributo não tem indicação de nivel de acesso(provate, public, protected)
    //Seu nível de acesso será o default ou package, no qual todas as classes no mesmo pacote enxergam
    public void trabalhar(){
        System.out.println(String.format("%s multiplicando a fortuna", nome));
    }

    public String getNome() {
        return nome;
    }
    
    
}
