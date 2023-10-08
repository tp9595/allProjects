package org.java_11accspecifier2;

public class AccSpecdefault {//Outside package we ca not access. Default data 

	public static void main(String[] args) {
		AccSpecdefault obj = new AccSpecdefault();
		obj.test();
		System.out.println(obj.a);
	}

}
