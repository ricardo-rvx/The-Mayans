package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.numericController;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numericController nc = new numericController();
        
        List<String> entradas = new ArrayList<>();
        String input;

        do {
            input = sc.nextLine();
            entradas.add(input);
        } while (!input.trim().equals("*"));

        for (String linha : entradas) {
            String[] vetInput = linha.split(" ");
            try {
                long retorno = nc.conversorMayan(vetInput);
                System.out.println(retorno);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        sc.close();
    }
}