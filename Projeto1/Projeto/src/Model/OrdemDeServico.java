/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 55759
 */
public class OrdemDeServico extends Orcamento{
    
    public OrdemDeServico(String cpfCliente, String cpfMecanico, Double valor, String servico) {
        super(cpfCliente, cpfMecanico, valor, servico);
    }
    
}
