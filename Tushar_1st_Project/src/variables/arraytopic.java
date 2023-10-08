package variables;

import java.util.Arrays;

public class arraytopic {
	
//	void number ()
//	{
//	
//		int arr[] = {1, 5, 6, 2, 9};
//	    
//		
//		for(int i : arr)
//		{
//			
//			System.out.println(i);
//			
//		}
//	
//		//System.out.println(arr);
//		}
//	void toStringmethod()
//	{
//		int arr[] = {1, 5, 6, 2, 9};
//		
//		System.out.println(Arrays.toString(arr));
//	}
//	
//	void reverseArrys()
//	{
//		int arr[] = {1, 5, 6, 2, 9};
//	}
//	void sortArrys()
//	{
//		int arr[] = {1, 5, 6, 2, 9};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//	}
//	void comareTwoArrays()
//	{
//		int arrOne[] = {1, 5, 6, 2, 9};
//		int arrTwo[] = {1, 5, 6, 9, 9};
//		System.out.println(Arrays.equals(arrOne, arrTwo));
//	}
//	
	
		public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line    
		}    
		}}
	
	


