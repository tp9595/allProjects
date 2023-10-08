package variables;

import java.util.Scanner;

public class scannerclass {
    void newnumber()
    {
    	
    	Scanner sc = new Scanner(System.in);
    
    	System.out.println("enter roll number");
    	int age = sc.nextInt();
    			System.out.println("your age" + age);
    			sc.close();
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scannerclass obj = new scannerclass();
		obj.newnumber();
		
	}

}
