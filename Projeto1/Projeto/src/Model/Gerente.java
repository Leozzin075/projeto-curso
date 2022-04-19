/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55759
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }

    public static void cadastrarFuncionario(String nome, String cpf, String senha, String cargo) {
        File dir = new File("C:\\ArquivosProjeto");
        //Cria um novo arquivo
        File arq = new File(dir, "Funcionarios.txt");
        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List<String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();

            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] funcionario = s.split(";");

                //Criamos um objeto User e setamos em Funcionarioseus atributos
                //as posições correspondentes do array
                printWriter.print(funcionario[0] + ";");
                printWriter.print(funcionario[1] + ";");
                printWriter.print(funcionario[2] + ";");
                printWriter.println(funcionario[3] + ";");
            }
            
            printWriter.print(nome + ";");
                printWriter.print(cpf + ";");
                printWriter.print(senha + ";");
                printWriter.println(cargo + ";");

            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void visualizarCliente(){
        File dir = new File("C:\\ArquivosProjeto");
        //Cria um novo arquivo
        File arq = new File(dir, "Cliente.txt");
        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();

            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                User u = new User();
               

                //exibe o conteúdo do objeto u
                System.out.println(u.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    
}
