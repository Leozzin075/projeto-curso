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
public class Mecanico extends Funcionario{

    
    public Mecanico(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    
    public static void cadastrarOrcamento(String cpfCliente, String cpfMecanico, String valor, String servico) {
       File dir = new File("C:\\ArquivosProjeto");
       //Cria um novo arquivo
       File arq = new File(dir, "Orcamento.txt");
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
               String[] orcamento = s.split(";");

               //Criamos um objeto User e setamos em Funcionarioseus atributos
               //as posições correspondentes do array
               printWriter.print(orcamento[0] + ";");
               printWriter.print(orcamento[1] + ";");
               printWriter.print(orcamento[2] + ";");
               printWriter.println(orcamento[3] + ";");
           }

           printWriter.print(cpfCliente + ";");
               printWriter.print(cpfMecanico + ";");
               printWriter.print(valor + ";");
               printWriter.println(servico + ";");

           printWriter.flush();
           printWriter.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    
}

