package br.com.johnidouglasmarangon;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.Set;
import java.util.HashSet;
import java.util.Deque;
import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.*;

class CakeTest {

    @Test
    void countTallestCandles() {
        assertEquals(2, Cake.countTallestCandles(List.of(4, 4, 1, 3)));
        assertEquals(2, Cake.countTallestCandles(List.of(3, 2, 1, 3)));
        assertEquals(1, Cake.countTallestCandles(List.of(2, 2, 2, 1, 3)));
        assertEquals(1, Cake.countTallestCandles(List.of(1, 5)));
        assertEquals(2, Cake.countTallestCandles(List.of(3, 9, 9)));
    }

    @Test
    void countTallestCandlesEmptyList() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Cake.countTallestCandles(List.of());
        });
        assertEquals("O bolo deve ter pelo menos uma vela!", exception.getMessage());
    }

    @Test
    void countTallestCandlesFullList() {
        assertEquals(5, Cake.countTallestCandles(List.of(7, 7, 7, 7, 7)));
    }

    @Test
    void countTallestCandlesWithDifferentDataType() {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        assertEquals(1, Cake.countTallestCandles(set));

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(3);
        deque.push(9);
        deque.push(3);
        assertEquals(1, Cake.countTallestCandles(deque));
    }
}
