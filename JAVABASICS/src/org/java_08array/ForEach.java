package org.java_08array;

public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sneha[] = {18,28,39,45,589,6852,785,856,956,1230};
//		System.out.println(sneha[0]);
//		System.out.println(sneha[1]);
//		System.out.println(sneha[2]);
//		System.out.println(sneha[3]);
		
	for(int i:sneha) {//for each loop 
		System.out.println(i);
	}
	for(int i=0;i<sneha.length;i++) {//for loop 
		System.out.println(sneha[i]);
	}
		

}
}