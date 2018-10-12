package Tuan_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class maxTwoIntTest {
    @Test
    public void maxTwoInt1() {
        int max = maxTwoInt.compare(2, 3);
        assertEquals(3, max);
    }
    @Test
    public void maxTwoInt2() {
        int max = maxTwoInt.compare(4, 5);
        assertEquals(5, max);
    }
    @Test
    public void maxTwoInt3() {
        int max = maxTwoInt.compare(200, 100);
        assertEquals(200, max);
    }
    @Test
    public void maxTwoInt4() {
        int max = maxTwoInt.compare(-1, -10);
        assertEquals(-1, max);
    }
    @Test
    public void maxTwoInt5() {
        int max = maxTwoInt.compare(-25, -15);
        assertEquals(-15, max);
    }
}