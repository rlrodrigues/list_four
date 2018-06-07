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
public class ImpostoDeRenda {
    private double aliquota = 0.1;
    
    public double calculaImpostoDeRenda(Pessoa p)
    {
        if(p instanceof PessoaFisica)
            return (p.getRendaBruta() - (p.getRendaBruta() * this.aliquota));
        else if(p instanceof PessoaJuridica)
            return (p.getRendaBruta() - (p.getRendaBruta() * this.aliquota));
        else
            return (p.getRendaBruta() - (p.getRendaBruta() * this.calculaAliquota(p.getRendaBruta())));
    }
    
    public double calculaAliquota(double valor)
    {
        double aliquota;
        
        if(valor < 1500)
            aliquota = 0;
        else if(valor > 1500 && valor < 2500)
            aliquota = 0.075;
        else if(valor > 2500 && valor < 3750)
            aliquota = 0.1;
        else if(valor > 3750 && valor < 4500)
            aliquota = 0.15;
        else if(valor > 4500)
            aliquota = 0.22;
        else
            return 0;
        
        return aliquota;
    }
}
