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
public class Funcionario extends Pessoa{
        protected String senha;
    protected String logar;
    public funcionarios(String senha, String nome, String cpf, String logar) {
        super(nome, cpf);
        this.senha = senha;
        this.logar = logar;
    }
}
