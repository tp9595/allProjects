package org.additionalProgram;

public class EvenRangeByHarsha {
	public static void even() {

		for(int i=2;i<=100;i+=2) {

			System.out.print(i+" ");

		}System.out.println();

	}

	public static void odd() {

		for(int i=1;i<=100;i+=2) {
			System.out.print(i+" ");

		}

	}
	public static void main(String[] args) {
		EvenRangeByHarsha.even();
		EvenRangeByHarsha.odd();
	}
}