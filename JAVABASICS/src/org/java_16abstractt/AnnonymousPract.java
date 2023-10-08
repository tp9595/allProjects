package org.java_16abstractt;

public abstract class AnnonymousPract {
	
	
	public abstract  void r1();

	public static void main(String[] args) {
		
		AnnonymousPract ab1= new AnnonymousPract() {
			public void r1() {
				System.out.println("r1");
			}
		};
		AnnonymousPract ab2= new AnnonymousPract() {
			public void r1() {
				System.out.println("r2");
			}
		};
		ab1.r1();
		ab2.r1();
		
	}

}
