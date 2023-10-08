package Stringprogramprac;

public class vowelsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String s = "hello";
//  int count = 0;
//		for(char c : s.toCharArray())
//		{
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//			{
//				count++;
//			}
//		}
//			
//		System.out.println(count);
//		
//	}
	String	input = "tushar is good boy";
		 char[] inputArray = input.toCharArray();  
	        char[] result = new char[inputArray.length];  

	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
    System.out.println(String.valueOf(result));
    int j = result.length - 1;  

    for (int i = 0; i < inputArray.length; i++) {  
        if (inputArray[i] != ' ') {  
            if (result[j] == ' ') {  
                j--;  
            }  
            
           result[j] = inputArray[i];  
            j--;  
        }  
    }  
    System.out.println(input + " --> " + result); 	
}
}