package org.java_06ForLoop;

public class Nestedfor6 {

	public void alpha(char ch , char ch1 , char ch2) {


		for(;ch<=67;ch++,ch1++,ch2++)
			
		{
			System.out.println(ch+" "+ch1+" "+ch2);
			


		}
		//System.out.println();

	}
	public static void main(String[] args) {
		Nestedfor6 obj = new Nestedfor6();
		obj.alpha('A','A','A');
		System.out.println("**********");
		obj.test('A');
	}



	public void test (char ch) {
		for(;ch<='C';ch++){
			for(int i =1; i<=3;i++) {
				System.out.print(ch+ " ");
			}
			//System.out.println();
		}
	}
}