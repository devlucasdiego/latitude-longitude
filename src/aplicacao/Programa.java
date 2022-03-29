package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {
        String caminho = "D:\\tabelas\\pesquisa.txt";

        // Ler stream de dados
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(caminho);
            bufferedReader = new BufferedReader(fileReader);

            String linha = bufferedReader.readLine(); // Ler o arquivo até a quebra de linha.
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
