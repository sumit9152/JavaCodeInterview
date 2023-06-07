import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount
{
	
	public static void main(String[] args) 
	{
		
	
		// Frequency count of String value, String Array and Int arrya;
		//with the help of java 8 Stream API
		
		
		
		String name="raaj";
		
             System.out.println(Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					
					);
			
			
		    int kaka[]= {1,5,7,8,4,8,9,65,1,5,7};
	        System.out.println(Arrays.stream(kaka).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	        		);
			
	        String kaka1[]= {"sumit","name","hello","hello","mama","sumit"};
	        System.out.println(Arrays.stream(kaka1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	        		);
		
		
		
		
		
		
		
		
		
		
	}

}
