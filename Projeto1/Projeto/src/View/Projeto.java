/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Funcionario;
import Model.Gerente;
import Model.Mecanico;
import Model.Recepcionista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 55759
 */
public class Projeto {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao sistema ImperiCar!");
        Scanner scan = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("\nDigite 1 para Fazer Login\nDigite 0 para sair");
            escolha = Integer.parseInt(scan.nextLine());
            switch(escolha){
                case 1:
                    System.out.println("\nDigite seu nome");
                    String nome = scan.nextLine();
                    System.out.println("\nDigite sua senha");
                    String senha = scan.nextLine();
                    login(nome, senha);
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado");
                    break;
                default:
                    System.out.println("\nOpção Inválida");
            }

        } while(escolha != 0);
        
    }
    
    private static void login(String nome, String senha){
        File dir = new File("C:\\ArquivosProjeto");
        //Cria um novo arquivo
        File arq = new File(dir, "Funcionarios.txt");
        
        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            //cada linha do arquivo que corresponde a um Funcionario
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                //Usamos o método split da classe String
                //para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] funcionario = s.split(";");

                //Criamos um objeto Funcionario e setamos em seus atributos
                //as posições correspondentes do array
                
                if(funcionario[0].equals(nome) && funcionario[2].equals(senha)){
                    switch(funcionario[3]){
                        case "1":
                            Gerente gerente = new Gerente(funcionario[0], funcionario[1], funcionario[2]);
                            telaGerente(gerente);
                            break;
                        case "2":
                            Mecanico mecanico = new Mecanico(funcionario[0], funcionario[1], funcionario[2]);
                            telaMecanico(mecanico);
                            break;
                        case "3":
                            Recepcionista recepcionista = new Recepcionista(funcionario[0], funcionario[1], funcionario[2]);
                            telaRecepcionista(recepcionista);
                            break;
                    }
                } else {
                    System.out.println("\nNome ou senha incorreto, tente novamente!");
                }
                
            }
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void telaGerente(Gerente gerente) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar funcionario");
        System.out.println("Digite 2 para visualizar os clintes");
        String opcao = scan.nextLine();
        switch(opcao){
        case"1":
            System.out.println("Digite o nome");
            String nome = scan.nextLine();
            System.out.println("Digite o cpf");
            String cpf = scan.nextLine();
            System.out.println("Digite a senha");
            String senha = scan.nextLine();
            System.out.println("Digite o cargo\n 1 para gerente, 2 para mecanico, 3 para recepcionista");
            String cargo = scan.nextLine();
            gerente.cadastrarFuncionario(nome, cpf, senha, cargo);    
            break;
        case "2":
            gerente.visualizarCliente();
            break;
        default:
            System.out.println("Opcao invalida");
            break;
        }
    }
            

    private static void telaMecanico(Mecanico mecanico) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar Orçamento");
        String opcao = scan.nextLine();
        if(opcao.equals("1")){
            System.out.println("Digite o cpfCliente");
            String cpfCliente = scan.nextLine();
            System.out.println("Digite o cpfMecanico");
            String cpfMecanico = scan.nextLine();
            System.out.println("Digite a valor");
            String valor = scan.nextLine();
            System.out.println("Digite o servico");
            String servico = scan.nextLine();
            mecanico.cadastrarOrcamento(cpfCliente, cpfMecanico, valor, servico);
        }    }

    private static void telaRecepcionista(Recepcionista recepcionista) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar Cliente");
        String opcao = scan.nextLine();
        if(opcao.equals("1")){
            System.out.println("Digite o email:");
            String email = scan.nextLine();
            System.out.println("Digite o telefone:");
            String telefone = scan.nextLine();
            System.out.println("Digite a endereco:");
            String endereco = scan.nextLine();
            System.out.println("Digite a sua placa:");
            String placa = scan.nextLine();
            recepcionista.cadastrarCliente(email, telefone, endereco, placa);
            
        }
    }
    
}
