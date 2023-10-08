package org.java_18_1constantFinal;

public class Finalmethod {
	long AdharCard= 89562337485l;
	final long ADHARCARD1=859632145778l;// Variable name should be in capital letter
	

	public static void main(String[] args) {
		Finalmethod obj = new Finalmethod();
		System.out.println(obj.AdharCard);
		obj.AdharCard=65238945123l;// Here we can updated value
		System.out.println(obj.AdharCard);
		//obj.ADHARCARD1=85962456856l;// Here we can not update value of final variable
		System.out.println(obj.ADHARCARD1);
	}

}
