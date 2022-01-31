package br.com.johnidouglasmarangon;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Digite a string para calcular a similaridade: ");
            String input = sn.nextLine();

            Integer count = StringSimilatity.calc(input);
            
            System.out.println(count);
        }
        
    }
}
