package br.com.johnidouglasmarangon;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.print("Digite o tamanho das velas do bolo separado por hifem. Ex: 4-4-1-3: ");

            String input = scanner.nextLine();

            List<Integer> candles = Arrays.asList(input.split("-")).stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());

            Integer count = Cake.countTallestCandles(candles);
            System.out.println(count);
        } catch (NumberFormatException e) {
            System.err.print("O tamanho das velas do bolo deve ser númerico e separado por hifem. Ex: 3-1-3-9");
        }

    }
}
