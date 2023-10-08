package programpractice;

public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10,b=20;
      
      System.out.println("before swaping two number..." +a+" "+b  );
     // using third variable
      int t =a;
      a=b;
      b=t;
	// without using third variable
   //   a=a+b;  //10+20=30
   //   b=a-b;  //30-20=10
//  a=a-b;//30-10=20
//      
//      // multiplication and devision logic
//      // a nd b value should be zero
    // a=a*b;  //10*20=200
    // b=a/b; // 200/20= 10;
      
   //  a=a/b;  //200/10=20
//      
//      // bitwise  XOR(^)oprator
//      a=a^b;     a=1010 b=10100 outpot 11110
//      b= a^b;
//      a=a^b;
//     // single staatement
//    b= a+b -(a=b);
      
      
    		  
      System.out.println("after swaping two number..." +a+" "+b  );
	
	}
	
	

}
