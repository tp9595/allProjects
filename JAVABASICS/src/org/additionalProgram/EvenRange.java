package org.additionalProgram;

public class EvenRange {
	public static void even() {
	
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}System.out.println();

}
	
	public static void odd() {
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}
	public static void main(String[] args) {
		EvenRange.even();
		EvenRange.odd();
	}
}