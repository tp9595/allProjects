package org.additionalProgram;

public class PrimeNoRange {
	
	
	public static void main(String[] args) {
		int rohit=0;
		for(int num = 2; num <= 50; num++) {//5
            for(int i = 2; i <= (num / 2); i++) {//2-->2

                if(num % i == 0) {//5%2=1
                   rohit  = num;//10
                    break;
                }
            }

            // For printing prime .
            if(rohit  != num) {
                System.out.print(num + " ");
            }
        }
    }
	

}


