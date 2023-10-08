package org.java_18exceptionHandling;


public class ReturnFinally3 {

	public static void main(String[] args) {
		ReturnFinally3 obj = new ReturnFinally3();
		obj.test();
	}
	
	public int test(){	
		try {
			System.out.println("Try 1.1");
			int a =10,b=0,  div = 0;
			div=a/b;
				return div;// after this return remaining code not get executed but finally block get executed. 
			
	
//			//System.out.println("Try 1.2");
//			System.out.println("Try 2.1");
//			for(int i =0;i<=10;i++) {
//				
//				if (i==5)
//					continue;
//					
//				System.out.println(i);
//			}
//			System.out.println("Try 2.2");
//			//scn.close();//We can not write here if exceptions occurs before this line it will not reach till this line
			}catch(Throwable e) {
			System.out.println("Catch 1");
			e.printStackTrace();
			System.out.println("Catch 1");
			//scn.close()//We can not write here if not exceptions occurs then catch block not get executed.  
		}finally {
			System.out.println("Finally Executed");
		}//Finally block is use to execute imp statement such as closing connection,stream etc.
		//Finally block always execute whether exception occurs or not (Handled or not).
		//return Keyword not effects on finally block.
		return 12;
	}
}


