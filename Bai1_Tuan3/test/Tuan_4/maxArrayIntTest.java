package Tuan_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class maxArrayIntTest {

    @Test
    public void maxArrayInt1() {
        int arr1[] = {6, 3, 9, 1, 0, 4, 15, -6, -5, -7};
        int min = maxArrayInt.maxArrayInt(arr1);
        assertEquals(-7, min);
    }

    @Test
    public void maxArrayInt2() {
        int arr1[] = {6, 5, 15, -6, -5};
        int min = maxArrayInt.maxArrayInt(arr1);
        assertEquals(-5, min);
    }

    @Test
    public void maxArrayInt3() {
        int arr1[] = {6, 3, 9, 1, 6, 4, 15, 100};
        int min = maxArrayInt.maxArrayInt(arr1);
        assertEquals(1, min);
    }

    @Test
    public void maxArrayInt4() {
        int arr1[] = {6, 3, 9, 1, 0, 4, 15, 3};
        int min = maxArrayInt.maxArrayInt(arr1);
        assertEquals(0, min);
    }

    @Test
    public void maxArrayInt5() {
        int arr1[] = {6, 3, -99, 1, 0, 4, 15, -6, -5, -7};
        int min = maxArrayInt.maxArrayInt(arr1);
        assertEquals(-99, min);
    }
}