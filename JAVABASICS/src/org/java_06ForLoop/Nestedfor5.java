package org.java_06ForLoop;

public class Nestedfor5 {

	public void alpha(char ch , char ch1 , char ch2) {


		for(;ch<='A';ch++) {
			for(;ch1<='B';ch1++) {
				for(;ch2<='C';ch2++) {
					for(int l=1;l<=3;l++) {
						System.out.println(ch+" "+ch1+" "+ch2);
					}

				}

			}

		}
	}
	public static void main(String[] args) {
		Nestedfor5 obj = new Nestedfor5();
		obj.alpha('A','B','C');
	}

}
