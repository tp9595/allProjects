package org.java_09string;

public class TostringMethod {

	public static void main(String[] args) {
		TostringMethod obj = new TostringMethod();
		System.out.println(obj);//Implicitly call tostring method
		System.out.println(obj.toString());//explicitly call
		TostringMethod obj1 = new TostringMethod();
		System.out.println(obj1);//Implicitly call tostring method
		System.out.println(obj1.toString());//explicitly call
		
	}//toString() is a method of object class.
	//but it is overided in string class
	//user can override the to string method.
	//fully Qualified class name(packagename.classname@hexadecimalvalue)
//  org.string.TostringMethod@515f550a
//	org.string.TostringMethod@515f550a
//	org.string.TostringMethod@626b2d4a
//	org.string.TostringMethod@626b2d4a

}
