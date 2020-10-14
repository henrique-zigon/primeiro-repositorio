
package br.com.bandtec.lista01;


public class Login {
    public static void main(String[] args) {
        String login="Henriquezigon";
        String senha="12345";
        Integer qnt=3;
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado", login,senha,qnt));
    }
}
