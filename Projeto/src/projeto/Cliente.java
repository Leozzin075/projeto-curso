/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author ALUNO
 */
public class Cliente extends Pessoa{
        protected String email;
    protected String telefone;
    protected String endereco;
    protected String placa;

    public Cliente(String email, String telefone, String endereco, String placa, String nome, String cpf) {
        super(nome, cpf);
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.placa = placa;
    }
}
