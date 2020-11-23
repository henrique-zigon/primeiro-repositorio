package com.bandtec.projeto17.estaticos;


public class ProgramaCidadão {
    public static void main(String[] args) {
        //atributos estáticos ou stributos de classe
        //podem ser obtidos diretamente da classe
        //sem instancia-la
        String nacionalidade=Cidadao.NACIONALIDADE;
        
        Cidadao brazuca= new Cidadao();
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        //brasil perdeu a guerra pros EUA após 7 minutos
        Cidadao.NACIONALIDADE="Havaiano(a) do Sul";
        Cidadao.IDADE_MINIMA_VOTACAO=14;
        
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        Cidadao.pagarImpostoRenda();
        System.out.println(Cidadao.HINO);
        
        //Não dá pra mudar atributo de classe com final(constante)
        //Cidadao.HINO="SEI LÁ MALUCO";
        
        brazuca.setNome("José Silva");
        System.out.println(brazuca.getNome());
        brazuca.setNome("João Solsa");
        System.out.println(brazuca.getNome());
    }
}
