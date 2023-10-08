package org.java_06ForLoop;

public class ForLoopChar4 {

	public void test2() {
		for (char ch='A';ch<='z';ch++) {

//			if((int)ch >=65 && (int)ch<=90 || (int)ch>=96 && (int)ch<=122 ) {
			if((int)ch<=90 || (int)ch>=97) {	
			continue;	
		}

		System.out.println(ch+" = "+(int)(ch));
	}
}

public static void main(String[] args) {
	ForLoopChar4 obj =new ForLoopChar4 ();
	obj.test2();


}

}
