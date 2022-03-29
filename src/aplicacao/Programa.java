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

        } catch (FileNotFoundException e) {

        }
    }
}
