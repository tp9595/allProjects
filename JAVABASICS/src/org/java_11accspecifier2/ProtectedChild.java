package org.java_11accspecifier2;

import org.java_10accspecifier.AccSpecProtected;

public class ProtectedChild extends AccSpecProtected {//Within Package outside the class.
	

	
	public static void main(String[] args) {
		ProtectedChild obj = new ProtectedChild();
		ProtectedChild.test();
		System.out.println(obj.a);
	}

}//Need inheritance to access protected data outside the package.

