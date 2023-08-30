import static org.junit.Assert.*;
import org.junit.Test;

public class Chandryaan3test {
    @Test
    public void testChandraan() {
        Chandryaan3 chandryaan = new Chandryaan3("N",new int[]{0,0,0});

        // Test:1 initial position and direction
        assertEquals("N", chandryaan.dir);
        assertArrayEquals(new int[] { 0, 0, 0 }, chandryaan.coordinates);


        // Test:2 sample test case
        Chandryaan3 obj = new Chandryaan3("N",new int[]{0,0,0});
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };

        obj.handleMove(commands);

        // result of test 2: Assert the expected final state
        assertEquals("N", obj.dir);
        assertArrayEquals(new int[] { 0, 1, -1 }, obj.coordinates);


        // Test:3 sample test case
        Chandryaan3 obj1 = new Chandryaan3("N",new int[]{0,0,0});
        char[] commands1 = { 'f', 'b' , 'b'};

        obj1.handleMove(commands1);

        //result of test 3
        assertEquals("N", obj1.dir);
        assertArrayEquals(new int[] { 0, -1, 0 }, obj1.coordinates);
    }
}