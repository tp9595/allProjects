package org.java_16abstractt;

abstract class AnnonymousFun {
	//public AnnonymousFun() {
		//System.out.println("Default");
		//}
		abstract int add(int a ,int b);//abstract class
		abstract int subs (int a ,int b);//abstract class

		public static void main(String[] args) {
			//AnnonymousFun obj = new AnnonymousFun();//error
			AnnonymousFun obj =new AnnonymousFun() {
				int add (int a ,int b) {
					System.out.println(a+b);
					return a+b;

				}
				int subs (int a ,int b) {
					return a-b;

				}

				};
		
		System.out.println(obj.add(12,15));
		System.out.println(obj.subs(15,96));


	}

}
