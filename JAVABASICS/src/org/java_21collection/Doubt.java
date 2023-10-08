package org.java_21collection;

public class Doubt {

	public static void main(String[] args) {
		
		Integer emp[] = new Integer [5];
		
		emp[0]=23;
		emp[1]=100;
		//emp[2]="sky";
		
		for (Integer obj :emp) {
		System.out.println(obj);
		
		}
		System.out.println("*************************");
		Object emp1[] = new Object [5];
		emp1[0]=23;
		emp1[1]=100;
		emp1[2]="sky";
		
		for (Object obj :emp1) {
			System.out.println(obj);
		
		
	}

}
}
