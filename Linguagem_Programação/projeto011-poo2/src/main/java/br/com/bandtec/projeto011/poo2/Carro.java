package br.com.bandtec.projeto011.poo2;

public class Carro {
    private Boolean ligado;
    private String modelo;
    private Integer marcha;
    private Integer velocidade;
//---------MODEL0
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
//-----------LIGAR
    public void Ligar(Boolean ligado){
        this.ligado=ligado;
    }
    
//-----MARCHAS    
    public void setAumentarMarcha() {
        if (ligado && marcha<6) {
            this.marcha++;
        }
    }
    
    public void setDiminuirMarcha(){
        if (ligado && marcha>-1) {
            this.marcha--;
        }
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }
    
    
//------VELOCIDADE
    public void AumentarVelo(Integer velocidade){
        this.velocidade=velocidade;
    }
    public void DiminuirVelo(Integer velocidade){
        this.velocidade=velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }
    
}
