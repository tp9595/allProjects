package org.java_19wrapperclass;
//A class that wraps a primitive data type into an object is called
// wrapper class in java.
public class Boxing {
//boxing convert primitive into non-primitive class.
	public static void main(String[] args) {
		int a =10;//primitive 
		//Integer aObj1=new Integer(10);//Error Dega ab deprecated 
		Integer Obj =Integer.valueOf(a);//object of primitive data type.
		Integer aObj1 = Integer.valueOf(10);//this not object of primitive data_type.
		
		
		//System.out.println("a = "+a);//primitive data type
		
		System.out.println("aObj = "+Obj);//object   
		System.out.println("aObj1 = "+aObj1);//
		
		byte b= 89;
		Byte bObj = Byte.valueOf((byte)(89));
		Byte bObj1 = Byte.valueOf(b);
		System.out.println("b = "+b);
		System.out.println("bObj = "+bObj);
		
		float f= 85.23f;
		Float fObj = Float.valueOf(85.23f);
		Float fObj1 = Float.valueOf(f);
		System.out.println("f = "+f);
		System.out.println("fObj = "+fObj);
		
		double d= 898.856;
		Double dObj = Double.valueOf(12354);
		Double dObj1 = Double.valueOf(d);
		System.out.println("d = "+d);
		System.out.println("dObj = "+dObj);
		
		short s= 85;
		Short sObj = Short.valueOf((short)(123));
		Short sObj1 = Short.valueOf(s);
		System.out.println("s = "+s);
		System.out.println("sObj = "+sObj);
		
		long l= 855623322l;
		Long lObj = Long.valueOf(8369901063l);
		Long lObj1 = Long.valueOf(l);
		System.out.println("l = "+l);
		System.out.println("lObj1 = "+lObj1);
		System.out.println("lObj = "+lObj);
		
		char ch = 'H';
		Character chObj = Character.valueOf(ch);
		Character chObj1 = Character.valueOf('R');
		System.out.println("ch = "+ch);
		System.out.println("chObj = "+chObj);
		System.out.println("chObj1 = "+chObj1);
		
		boolean flag = true;
		Boolean flObj = Boolean.valueOf(false);
		Boolean flObj1 = Boolean.valueOf(true);
		System.out.println("ch = "+flag);
		System.out.println("flObj = "+flObj);
		System.out.println("flObj1 = "+flObj1);
		
		String str =String.valueOf(20.3);
		System.out.println(str);
		
		

	}

}
