package org.additionalProgram;

public class AmstrongNumber {
	
	public void test(int a){
	int amstrg =0;
	int temp =a;
	while(a>0) {
		int rem = a%10;//3//5//1
		amstrg=amstrg+rem*rem*rem;//27//27+125//152+1=153
		a=a/10;//15//1//0
		}
	if(temp==amstrg) {
		System.out.println(temp+" is amstrong ");
	}else {
		System.out.println(temp+" is not amstrong");
	}
		
	}

	public static void main(String[] args) {
		AmstrongNumber obj = new AmstrongNumber();
		obj.test(153);//1*1*1+5*5*5+3*3*3
		obj.test(896);

	}

}
