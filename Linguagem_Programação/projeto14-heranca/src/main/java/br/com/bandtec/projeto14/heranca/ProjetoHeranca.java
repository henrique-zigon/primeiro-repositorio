package br.com.bandtec.projeto14.heranca;

import br.com.bandtec.projeto14.heranca.modelos.FilhoRico;
import br.com.bandtec.projeto14.heranca.modelos.PaiRico;

public class ProjetoHeranca {
    public static void main(String[] args) {
        PaiRico pai=new PaiRico("Tio Patinhas");
        FilhoRico filho= new FilhoRico("Huguinho");
        
        pai.trabalhar();
        filho.trabalhar();
        
        System.out.println(pai.getNome());
        System.out.println(filho.getNome());
        filho.ostentar();
        
        //Antes da igualdade é a declaração
        //na declaração a Java sabe o que o objeto é em tempo de compilação
        //ou seja, na IDE, enquanto programamos
        //Depois da igualdade é a implementação
        //na implementação, é como o objeto vai se comportar em tempo de
        //execução(Run time)
        //(Ou seja, é um objeto PaiRico, mas age como se fosse um Filho,
        //só posui funções do Pai, mas responde como filho)
        PaiRico pessoaX=new FilhoRico("Zé");
        pessoaX.trabalhar();
        //trabalhar() será o da classe FilhoRico
        //porém não consigo programar a invocação do método ostentar()
        //visto que não existe em PaiRico
    }
}
