
package br.com.bandtec.lista01;

public class SalárioLíquido {
    public static void main(String[] args) {
        Double bruto=3550.00;
        
        Double inss=10.0/100.0;
        Double inss1=bruto*inss;
        Double ir=20.0/100.0;
        Double ir1=bruto*ir;
        
        Double condução=4.8;
        Double vt=condução*2*22;
        
        Double descontos=(inss1+ir1+vt);
        
        Double liquido=bruto-descontos;
        System.out.println(String.format("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", bruto,descontos,liquido));
    }
    
}
