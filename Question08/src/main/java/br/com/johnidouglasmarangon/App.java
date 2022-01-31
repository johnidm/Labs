package br.com.johnidouglasmarangon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite números separados por hifem para serem ordenados. Ex: 3-0-9-9: ");

            String input = sc.nextLine();

            ArrayList<Integer> numbers = new ArrayList<Integer>();

            for (String i : input.split("-")) {

                try {
                    numbers.add(Integer.valueOf(i));
                } catch (NumberFormatException ex) {
                    System.err.println(String.format("---> A string '%s' não é um número.", i));
                }
            }

            InsertionSort is = new InsertionSort();
            InsertionSortResult result = is.exce(numbers.toArray(new Integer[numbers.size()]));

            System.out.println("Entrada: " + numbers.toString());
            System.out.println("Saída  : " + Arrays.toString(result.arr));
            System.out.println("Trocas : " + result.shifts);

        };
        
    }
}
