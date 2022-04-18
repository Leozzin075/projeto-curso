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
public class Orcamento {
    protected String cpfCliente;
    protected String cpfMecanico;
    protected Double valor;
    protected String servico;

    public Orcamento(String cpfCliente, String cpfMecanico, Double valor, String servico) {
        this.cpfCliente = cpfCliente;
        this.cpfMecanico = cpfMecanico;
        this.valor = valor;
        this.servico = servico;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCpfMecanico() {
        return cpfMecanico;
    }

    public void setCpfMecanico(String cpfMecanico) {
        this.cpfMecanico = cpfMecanico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    
}
