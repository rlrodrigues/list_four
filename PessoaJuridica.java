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
public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj, double rendaBruta) {
        super(rendaBruta);
        this.cnpj = cnpj;
    }
}
