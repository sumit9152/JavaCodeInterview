import java.util.Arrays;
import java.util.List;

public class MaxLengthString {

	public static void main(String[] args) 
	{
		// find the max length from the given 'string array'  .
		String [] strArray={"java","Pune","Mumbai","maharashtra"};
		
		String data=Arrays.stream(strArray)
		.reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
		.get();
		System.out.println(data);
		
		
		//<--------------------------------------------------------
		

   List<String> l1= Arrays.asList("pune","chacha","m","mumbai123");
    int index=0;
    int element=l1.get(0).length();
    String data1="";
    for(String s:l1)
    {
        if(s.length()>=element)
        {
            element=s.length();
            data1=s;
        }


    }
    System.out.println(element);

    System.out.println(data1);

	//<--------------------------------------------------------
	
	
	String arr[]={"mahar","chacha","m","Pune"};
	  
   
    int element1=arr[0].length();
    String data2="";
    for(String s:arr)
    {
        if(s.length()>=element1)
        {
            element1=s.length();
            data2=s;
        }


    }
    System.out.println(element1);

    System.out.println(data2);
}

}
