package org.java_18exceptionHandling;

public class SuperClassException {

public static void main(String[] args) {

		try {
			System.out.println("Program Start ");
			int a=10,b=10, div=0;
			System.out.println("Try_1");
			div=a/b;
			System.out.println(div);
			System.out.println("Try_2");
			String Str= "Mumbai";
			System.out.println("CharAt = "+ Str.charAt(5));
			System.out.println("Try_3");
			int ar[]= {50,60,89,85,63};
			System.out.println(ar[10]);
			
			catch (Exception e) {
				System.out.println("Any Exception Catch_3.1");
				e.printStackTrace();
				System.out.println("Any Exception Catch_3.2");

//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
//We can not write catch block after Exception class catch box
			}
			catch (Throwable t) {//It handles both Error as well as exception
				System.out.println("Any Exception Catch_3.1");
				t.printStackTrace();
				System.out.println("Any Exception Catch_3.2");
			
			
			}catch(ArithmeticException obj) {
			System.out.println("Catch_1.1");
			obj.printStackTrace();
			System.out.println("Catch_1.2");

		}catch(StringIndexOutOfBoundsException obj) {
			System.out.println("Catch_2.1");
			obj.printStackTrace();
			System.out.println("Catch_2.2");
		} /*
			 * catch(ArrayIndexOutOfBoundsException obj) { System.out.println("Catch_3.1");
			 * obj.printStackTrace(); System.out.println("Catch_3.2"); }
			 */catch (Exception e) {
			System.out.println("Any Exception Catch_3.1");
			e.printStackTrace();
			System.out.println("Any Exception Catch_3.2");
			//Exception(Runtime & Compile Time) Class contain all the exception therefore, it will be use when we not sure about which exception will come.  
			
		}

	}
	
}