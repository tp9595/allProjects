package org.java_18exceptionHandling;


public class ContinueBreakFinally2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try 1.1");
			for(int i =0;i<=10;i++) {
				System.out.println(i);
				if (i==5){
					break;
					
				}
			}
			System.out.println("Try 1.2");
			System.out.println("Try 2.1");
			for(int i =0;i<=10;i++) {
				
				if (i==5)
					continue;
					
				System.out.println(i);
			}
			System.out.println("Try 2.2");
			//scn.close();//We can not write here if exceptions occurs before this line it will not reach till this line
			}catch(Throwable e) {
			System.out.println("Catch 1");
			e.printStackTrace();
			System.out.println("Catch 1");
			//scn.close()//We can not write here if not exceptions occurs then catch block not get executed.  
		}finally {
			System.out.println("Finally Executed");
		}//Finally block is use to execute imp statement such as closing connection,stream etc.
		//Finally block always execute whether exception occurs or not (Handled or not).
		//Continue and Break Keyword not effects on finally block.

	}

}
