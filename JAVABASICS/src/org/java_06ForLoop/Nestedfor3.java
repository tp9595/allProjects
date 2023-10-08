//package org.Loop;
//
//public class Nestedfor3 {
//
//	public static void main(String[] args) {
//
//		for(int i=7;i<=7;i++) {
//			for(int j=8;j<=8;j++) {
//				for(int k=9;k<=9;k++) {
//					for(int l=1;l<=3;l++) {
//						System.out.println(i+" "+j+" "+k);
//					}
//				}
//
//
//			}
//		}
//	}
//}

package org.java_06ForLoop;

public class Nestedfor3 {

	public void sameno(int i , int j , int k) {


		for(;i<=7;i++) {
			for(;j<=8;j++) {
				for(;k<=9;k++) {
					for(int l=1;l<=3;l++) {
						System.out.println(i+" "+j+" "+k);
					}

				}

			}

		}
	}
	public static void main(String[] args) {
		Nestedfor3 obj = new Nestedfor3();
		obj.sameno(7,8,9);
	}

} 