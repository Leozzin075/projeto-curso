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
public class Funcionario extends Pessoa{
    protected String senha;

    public Funcionario(String nome, String cpf, String senha) {
        super(nome, cpf);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    
}
