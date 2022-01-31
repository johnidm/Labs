package br.com.johnidouglasmarangon;

import java.util.Collection;
import java.util.Optional;

public class Cake {

    public static Integer countTallestCandles(Collection<Integer> candles) {
        /**
         * Retorna a quntidade de repetições da vela com maior tamanho.
         */
        if (candles.isEmpty()) {
            throw new IllegalArgumentException("O bolo deve ter pelo menos uma vela!");
        }

        Integer max = candles.stream().max(Integer::compare).get();

        return Math.toIntExact(candles.stream()
                .filter(number -> number == max)
                .count());

    }

}
