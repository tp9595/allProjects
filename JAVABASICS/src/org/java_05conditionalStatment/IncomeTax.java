package org.java_05conditionalStatment;

public class IncomeTax {
	//static int income;
	static double tax_percent;
	//static int age;
	public static void main (String[]args) {
		tax_Percent(27000,21);
	}
	
	public static void tax_Percent(int income,int age) {
	if (age < 60){ 
	    if (income <= 250000){ 
	        System.out.println(tax_percent = 0); 
	        
	    }else if (income >= 250001 && income <= 500000){ 
	        tax_percent = 0.1; 
	    }else if (income >= 500001 && income <= 1000000){ 
	        tax_percent = 0.2; 
	    }else{ 
	        tax_percent = 0.3; 
	    }  
	}else if (age >= 60 && age < 80){ 
	    if (income <= 300000){ 
	        tax_percent = 0;
	    }else if (income >= 300001 && income <= 500000){ 
	        tax_percent = 0.1; 
	    }else if (income >= 500001 && income <= 1000000){ 
	        tax_percent = 0.2; 
	    }else{ 
	        tax_percent = 0.3; 
	    }  
	}else{ 
	    if(income <= 500000){ 
	        tax_percent = 0; 
	    }else if (income >= 500001 && income <= 1000000){ 
	        tax_percent = 0.2; 
	    }else{ 
	        tax_percent = 0.3; 
	    }  
	} 
	 
	int tax = (int) (tax_percent * income);
	}
}
