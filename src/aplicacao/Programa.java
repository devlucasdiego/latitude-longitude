package aplicacao;

import java.io.*;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {

        // Caso não exista o arquivo "resultado-pesquisa.csv", será criado automaticamente na pasta.
        PrintWriter printWriter = new PrintWriter("D:\\tabelas\\resultado-pesquisa.csv");
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("D:\\tabelas\\meteorologico.csv"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D:\\tabelas\\solo.csv"));

        // Bloco "try" instanciando recursos na mesma linha e desalocando de forma automática quando o bloco acabar.
        try {
            // Ler o arquivo até a quebra de linha.
            String linha1 = bufferedReader1.readLine();
            String linha2 = bufferedReader2.readLine();
            while (linha1 != null || linha2 != null) {
                if (linha1 != null) {
                    printWriter.println(linha1);
                    linha1 = bufferedReader1.readLine();
                }
                if (linha2 != null) {
                    printWriter.println(linha2);
                    linha2 = bufferedReader2.readLine();
                }
            }

            printWriter.flush();
            bufferedReader1.close();
            bufferedReader2.close();
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Arquivos juntados com sucesso!");
    }
}