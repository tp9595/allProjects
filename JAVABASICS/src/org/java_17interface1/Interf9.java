package org.java_17interface1;

public interface Interf9 {
	
	public int add(int a,int b);
	public int sub(int a,int b);
}
interface Interf10 extends Interf9 {
	//
	public int add(int a,int b);
	public int sub(int a,int b);
}
class EX5 implements Interf10{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}// It gives only unique methods here.
