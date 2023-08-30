import static org.junit.Assert.*;
import org.junit.Test;

public class Chandryaan3test {
    @Test
    public void testChandraan() {
        Chandryaan3 chandryaan = new Chandryaan3();

        // Test:1 initial position and direction
        assertEquals("N", chandryaan.dir);
        assertArrayEquals(new int[] { 0, 0, 0 }, chandryaan.coordinates);


        // Test:2 sample test case
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };

        chandryaan.handleMove(commands);

        // result of test 2: Assert the expected final state
        assertEquals("N", chandryaan.dir);
        assertArrayEquals(new int[] { 0, 1, -1 }, chandryaan.coordinates);

    }
}