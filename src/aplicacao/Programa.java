package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {
        String caminho = "D:\\tabelas\\pesquisa.txt";

        // Bloco "try" instanciando recursos na mesma linha e desalocando de forma automática quando o bloco acabar.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {

            String linha = bufferedReader.readLine(); // Ler o arquivo até a quebra de linha.
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}