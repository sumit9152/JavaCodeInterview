import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccurrence {

	public static void main(String[] args) 
	
	{
		
		//first occurrence of a character in a string
		
		String s1="sumisum";
        for(char a:s1.toCharArray())
        {
            if(s1.indexOf(a)==s1.lastIndexOf(a))
            {
			    System.out.println("first occurenace character..+  "+ a);
				break;

            }

        }



           String name="Raaj";
		   
	        String nonrepeat = Arrays.stream(name.split(""))
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
	                .entrySet()
	                .stream()
					.filter(x->x.getValue()==1)
	                .findFirst().get().getKey();

	        System.out.println(nonrepeat);
		
		

	}

}
