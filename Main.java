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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImpostoDeRenda r = new ImpostoDeRenda();
        PessoaJuridica pj = new PessoaJuridica("asdad", 1000);
        r.calculaImpostoDeRenda(pj);
    }
    
}
