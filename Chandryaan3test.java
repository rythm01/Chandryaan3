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


        // Test:3 
        Chandryaan3 obj1 = new Chandryaan3("N",new int[]{0,0,0});
        char[] commands1 = { 'f', 'b' , 'b'};

        obj1.handleMove(commands1);

        //result of test 3
        assertEquals("N", obj1.dir);
        assertArrayEquals(new int[] { 0, -1, 0 }, obj1.coordinates);

        // Test:4 
        Chandryaan3 obj2 = new Chandryaan3("N",new int[]{0,0,0});
        char[] commands2 = { };

        obj2.handleMove(commands2);

        //result of test 4
        assertEquals("N", obj2.dir);
        assertArrayEquals(new int[] { 0, 0, 0 }, obj2.coordinates);

        // Test:5 
        Chandryaan3 obj3 = new Chandryaan3("Up",new int[]{1,1,1});
        char[] commands3 = {'r' , 'l', 'f' , 'f', 'u', 'b'};

        obj3.handleMove(commands3);

        //result of test 5
        assertEquals("Up", obj3.dir);
        assertArrayEquals(new int[] { 1, 3, 0 }, obj3.coordinates);
    }
}