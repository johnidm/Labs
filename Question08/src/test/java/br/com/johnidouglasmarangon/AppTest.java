package br.com.johnidouglasmarangon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    public void shouldComputeShitfs() {
        Integer[] data = { 4, 3, 2, 1 };

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = { 1, 2, 3, 4 };
        assertEquals(3, result.shifts);
        assertArrayEquals(excepted, result.arr);
    }

    public void shouldComputeShitfsGroupI() {
        Integer[] data = { 2, 1, 3, 1, 2 };

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = { 1, 1, 2, 2, 3 };
        assertEquals(4, result.shifts);
        assertArrayEquals(excepted, result.arr);
    }


    @Test
    public void shouldComputeEmptyArr() {
        Integer[] data = {};

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = {};
        assertEquals(0, result.shifts);
        assertArrayEquals(excepted, result.arr);
    }

    @Test
    public void shouldComputeEqualItemArr() {
        Integer[] data = { 9, 9, 9, 9, 9 };

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = { 9, 9, 9, 9, 9 };
        assertEquals(0, result.shifts);
        assertArrayEquals(excepted, result.arr);
    }

    @Test
    public void shouldComputeOrdenedArr() {
        Integer[] data = { 5, 6, 7, 8, 9, 10 };

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = { 5, 6, 7, 8, 9, 10 };
        assertEquals(0, result.shifts);
        assertArrayEquals(excepted, result.arr);
    }

    @Test
    public void shouldComputeTwoNumberArr() {
        Integer[] data = { 1, 1, 1, 2, 2 };

        InsertionSort is = new InsertionSort();
        InsertionSortResult result = is.exce(data);

        Integer[] excepted = { 1, 1, 1, 2, 2 };
        assertEquals(0, result.shifts);
        assertArrayEquals(excepted, result.arr);

    }

}
