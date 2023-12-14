import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testLargest 
{

    @Test
    void testPositive() 
    {
    	Largest largestNum = new Largest();
        int[] list = {1, 5, 3, 9, 2};
        int expectMax = 9;
        int max = largestNum.largest(list);
        assertEquals(expectMax,max);
    }
    
    
    @Test
    void testNegative() 
    {
    	Largest largestNum = new Largest();
        int[] list = {-1, -5, -3, -9, -2};
        int expectMax = -1;
        int max = largestNum.largest(list);
        assertEquals(expectMax,max);
    }
    
    @Test
    void testMixed() 
    {
    	Largest largestNum = new Largest();
        int[] list = {-1, 0, -3, 9, 2};
        int expectMax = 9;
        int max = largestNum.largest(list);
        assertEquals(expectMax,max);
    }
    
    
}