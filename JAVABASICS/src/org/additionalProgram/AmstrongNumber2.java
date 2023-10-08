package org.additionalProgram;

public class AmstrongNumber2 {
	
	public void test(int a){
	int amstrg =0;
	int temp =a;
	while(a>0) {
		int rem = a%10;
		amstrg=amstrg+rem*rem*rem*rem;
		a=a/10;
		}
	if(temp==amstrg) {
		System.out.println(temp+"  Is a Armstrong Number ");
	}else {
		System.out.println(temp+"  Is not a Armstrong Number ");
	}
		
	}

	public static void main(String[] args) {
		AmstrongNumber2 obj = new AmstrongNumber2();
		obj.test(1634);
		obj.test(8969);

	}

}
