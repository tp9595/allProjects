package org.java_09string;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SumOfDigitsPresentInString {
	static int a ;
	public static void main(String[] args) {
		String str ="Th56er84e i2s a ga555rd8en an7d i4t i893s b46ea8uti5ful";
		String str1=str.replaceAll("[a-zA-Z]"," ");
		System.out.println(str1);
		System.out.println(str1);
		String ar[]=str1.split(" ");
		int sum =0;
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			
			//here spaces also passed therefore we need to handle exception here 
			try {
				a=Integer.parseInt(ar[i]);
			}catch(NumberFormatException e) {
				continue;
			}
			sum=sum+a;
		}System.out.println("sum= "+sum);
		
	}

}
