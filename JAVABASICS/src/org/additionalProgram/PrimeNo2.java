
package org.additionalProgram;

public class PrimeNo2 {
	
	public void prime(int a) {
		boolean flag = false;
		for(int i=2;i<=a/2;i++) {
			if (a%i==0) {
				flag=true;
				break;
			}
		}
		if (flag==true) {
			System.out.println(a+" Is not prime Number");
			
		}else {
			System.out.println(a+" Is prime number");
		}
		
	}

	public static void main(String[] args) {
		PrimeNo2 obj = new PrimeNo2();
		obj.prime(12);
		obj.prime(13);

	}

}
