import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLargest2 {

	@Test
    void test() 
    {
    	Largest largestNum = new Largest();
    	int[][] testData = {
    			{1,5,3,9,2},
    			{-1,-5,-3,-9,-2},
    			{-1,0,-3,9,2}
    	};
    	
    	int[] expectMaxData = {9,-1,9};
    	
    	for (int i = 0; i < testData.length; i++) 
    	{
            int[] list = testData[i];
            int expectMax = expectMaxData[i];
            int max = largestNum.largest(list);
            assertEquals(expectMax,max);
            largestNum.display(max);

        }
    }
    

}
