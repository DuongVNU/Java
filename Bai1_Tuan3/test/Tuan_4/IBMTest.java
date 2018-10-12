package Tuan_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class IBMTest {

    @Test
    public void chiSoBMI1() {
        String status = IBM.chiSoBMI(46,1.59);
        assertEquals("Thiếu cân", status);
    }
    @Test
    public void chiSoBMI2() {
        String status = IBM.chiSoBMI(50,1.62);
        assertEquals("Bình thường", status);
    }
    @Test
    public void chiSoBMI3() {
        String status = IBM.chiSoBMI(60,1.55);
        assertEquals("Thừa cân", status);
    }
    @Test
    public void chiSoBMI4() {
        String status = IBM.chiSoBMI(100,1.54);
        assertEquals("Béo phì", status);
    }
    @Test
    public void chiSoBMI5() {
        String status = IBM.chiSoBMI(51,1.76);
        assertEquals("Thiếu cân", status);
    }
}