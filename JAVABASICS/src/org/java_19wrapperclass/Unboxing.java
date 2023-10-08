package org.java_19wrapperclass;

public class Unboxing {

	public static void main(String[] args) {
		int b =512;
		Double bObj=Double.valueOf(b);//boxing
		double d =bObj.doubleValue();//Unboxing
		float f= bObj.floatValue();
		int a= bObj.intValue();
		long l = bObj.longValue();
		byte k = bObj.byteValue();
		short s =bObj.shortValue();
		double g=bObj;//(implicit un_boxing)
	
		System.out.println("intb ="+b);
		System.out.println("+bObj ="+bObj);
		System.out.println("double = "+d);
		System.out.println("float = "+f);
		System.out.println("int = "+a);
		System.out.println("long = "+l);
		System.out.println("byte = "+k);
		System.out.println("short = "+s);
		System.out.println("implicit un_boxing = "+g);
		
		

	}

}
