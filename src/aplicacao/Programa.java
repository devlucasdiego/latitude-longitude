package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        File file = new File("D:\\tabelas\\pesquisa.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) { // Enquanto não chegar no fim da tabela, ler e imprimir linha.
                String linha = sc.nextLine();
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) // Caso o programa tente finalizar o scanner já fechado.
                sc.close();
        }
    }
}
