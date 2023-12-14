import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class testLargest3 {

	@Test
	void test() 
	{
		Largest largestNum = new Largest();
		
		try (BufferedReader inputDataReader = new BufferedReader(new FileReader("C:/Users/athir/eclipse-workspace/Lab9/src/input_data.txt"));
	             BufferedReader expectedResultsReader = new BufferedReader(new FileReader("C:/Users/athir/eclipse-workspace/Lab9/src/expected_results.txt"))) 
		{
			String inputDataLine;
            String expectedResultsLine;
            
            while ((inputDataLine = inputDataReader.readLine()) != null && (expectedResultsLine = expectedResultsReader.readLine()) != null) 
            {
                int[] list = parseInputData(inputDataLine);
                int[] expectMax = parseExpectedResults(expectedResultsLine);

                // Test Largest
                int max = largestNum.largest(list);
                assertArrayEquals(expectMax,new int[] {max});
                largestNum.display(max);
            }

		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	 private int[] parseInputData(String line) {
	        String[] values = line.split("\\s*,\\s*");
	        int[] arr = new int[values.length];
	        for (int i = 0; i < values.length; i++) {
	            arr[i] = Integer.parseInt(values[i]);
	        }
	        return arr;
	    }

	    private int[] parseExpectedResults(String line) {
	        String[] values = line.split("\\s*,\\s*");
	        int[] arr = new int[values.length];
		        for (int i = 0; i < values.length; i++) {
		            arr[i] = Integer.parseInt(values[i]);
		        }
	       return arr;
	    }

}
