
package br.com.bandtec.projeto02.nivelamente;

public class Programa3 {
    public static void main(String[] args) {
        
    String cidadao = "Maria Bigodenha";
    Integer filhos=4;
    Double bolsaFamilia=filhos*35.9;
    
    //Concatenação
    //System.out.prinln("O(a) cidadão"+cidadão+ " tem" +filhos+ " filhos e recebe R$" +bolsaFamilia+;
    
    //Interpolação
    //ex criando uma variavel(mas podria ser direto no println)
    String mensagem=String.format("O(a) cidadão %s tem %d filhos e recebe R$ %.2f do governo", cidadao,filhos,bolsaFamilia);
        System.out.println(mensagem);
        
        /*
        Interpolação:String.format("texto",valor1,valor2,valor3...valorN)
            -podem haver quantos valores forem necessarios após o texto
            -%s -> Indica que aqui vai entrar um valor String
            -%d -> Indica que aqui vai entrar um valor Integer
            -%.2f ->Indica que aqui vai entrar um valor Double
                  -> o ".2" indica a quantidade de casas decimais obrigatórias
                  -> no texto final é usado o padrão do SO(ex: "," para decimais no caso de pt-BR)
            -A ordem dos valores indica a ordem nos locais de substituição
                  ex: A "cidadao" entrou no lugar de %s porque ambos são os 1°s
                  ex: A "filhos" entrou no lugar de %d porque ambos são os 2°s
                  ex: A "bolsaFamilia" entrou no lugar de %.2f porque ambos são os 3°s
        */
    }
}
