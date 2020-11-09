package br.com.bandtec.projeto14.heranca.modelos;

/**
 esse extends diz que a classe filhorico é subclasse da pairico
 */
public class FilhoRico extends PaiRico{

    //Fomos obrigados a criar esse construtor, porque ele existe na superclasse
    public FilhoRico(String nome) {
        super(nome);
        //Esse super executa o construtor da superclasse
    }

    @Override
    public void trabalhar() {
        System.out.println(nome+" reduzindo a riqueza");
    }
    
    //uma classe pode ter métodos que não existem em sua superclasse
    public void ostentar(){
        System.out.println(nome+" gastando a $ com ostentação!");
    }
}
