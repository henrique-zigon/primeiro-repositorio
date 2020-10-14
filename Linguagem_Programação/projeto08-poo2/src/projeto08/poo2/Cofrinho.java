
package projeto08.poo2;
public class Cofrinho {
// ATRIBUTOS
    Double saldo=0.0;
    String situacao="ruim";
    String cor="#AA0000";
    
//MÉTODOS
    void depositar10(){
        if(saldo+10<=200){
            saldo+=10;
            atualizarSituacao();
        }
    }
    
    void tirar10(){
        if(saldo-10>=0){
            saldo-=10;
            atualizarSituacao();
        }
    }
    
    void atualizarSituacao(){
        if(saldo<=50){
                situacao="ruim";
                cor="#AA0000";
            }
            else if(saldo<=150){
                situacao="boa";
                cor="#000000";
            }
            else{
                situacao="ótima";
                cor="#0000FF";
            }
    }
}
