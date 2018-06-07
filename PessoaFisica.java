/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_03_exercicio_05;

/**
 *
 * @author ice
 */
public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf, double rendaBruta) {
        super(rendaBruta);
        this.cpf = cpf;
    }
}
