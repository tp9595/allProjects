package org.java_11accspecifier2;

import org.java_10accspecifier.AccSpecProtected;

public class AccSpecProtected2 {//Within Package outside the class.
	

	
	public static void main(String[] args) {
		AccSpecProtected obj = new AccSpecProtected();
		obj.test();
		System.out.println(obj.a);
	}

}//Need inheritance to access protected data outside the package.
