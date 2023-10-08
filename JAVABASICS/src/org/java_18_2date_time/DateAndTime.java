package org.java_18_2date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date Obj =new Date();// inbuild Class 
		System.out.println(Obj);//Fri Apr 22 19:30:02 IST 2022
		//to make it in required format 
		SimpleDateFormat obj2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ssSSS");
		//System.out.println(obj2);
		String str =obj2.format(Obj);//Format is method of SimpleDateFormat class
		System.out.println("Date & Time:\n "+str);
		obj2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ssSSS");
		String str1 =obj2.format(Obj);//Format is method of SimpleDateFormat class
		System.out.println("Date & Time:\n"+str1);
		str1=str1.replace("-","").replace(":", "").replace(" ", "");
		System.out.println("Date & Time:\n"+str1);
		//System.out.println("Date & Time:\n"+str1);
	}

}
