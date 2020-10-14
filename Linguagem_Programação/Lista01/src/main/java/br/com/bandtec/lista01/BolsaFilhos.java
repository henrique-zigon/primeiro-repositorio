
package br.com.bandtec.lista01;


public class BolsaFilhos {
    public static void main(String[] args) {
    Integer qntFilhos0a3=2;
    Integer qntFilhos4a16=1;
    Integer qntFilhos17a18=1;
    Integer filhos=(qntFilhos0a3+qntFilhos4a16+qntFilhos17a18);
    Double soma=((qntFilhos0a3*25.12)+(qntFilhos4a16*15.88)+(qntFilhos17a18*12.44));
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", filhos,soma));
    }
}
