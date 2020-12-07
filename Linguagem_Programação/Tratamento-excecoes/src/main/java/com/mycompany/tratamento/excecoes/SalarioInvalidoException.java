
package com.mycompany.tratamento.excecoes;


public class SalarioInvalidoException extends RuntimeException{
    private Double salario;

    public SalarioInvalidoException(Double salario) {
        this.salario = salario;
    }

    @Override
    public String getMessage() {
        return "Salário "+salario+" é inválido!";
    }
    
}
