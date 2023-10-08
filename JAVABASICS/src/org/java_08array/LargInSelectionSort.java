package org.java_08array;

public class LargInSelectionSort {


	public static void sort(int ar[]) {

		System.out.println("Before Sorting");
		for(int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++){
				if(ar[i]<ar[j]) {
					int temp =ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}if (i==0)
			{
				System.out.println("large Number= " +ar[0]);

				break;
			}	
		}
		//****************Descending Sort **************************			

		//**************For Largest No. in Optimize way *********** 			

	System.out.println("After Descending  Sorting");
	for (int i=0;i<ar.length;i++) {

		System.out.println(ar[i]);
	}
	//****************Ascending Sort **************************		
	for(int i=0;i<ar.length;i++) {
		for (int j=i+1;j<ar.length;j++){
			if(ar[i]>ar[j]) {
				int temp =ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}if (i==0) {
			System.out.println("Smalllest Number =" +ar[0]);

			//break;
		}
	}
	System.out.println("After Ascending   Sorting");
	for (int i=0;i<ar.length;i++) {

		System.out.println(ar[i]);
	}


}
public static void main(String[] args) {
	//int ar[]= {56,60,62,69,58,62,};
	//LargInSelectionSort.sort(ar);
	int arr[]= {10,5,30,52};
	int j=1;
	for (int i=0;i<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			int temp =arr[i];
			arr[i]=arr[j];
		     arr[j]=temp;	
			
		}if(j==arr.length-1)//4-1=3
		{
			j=i;
			i++;
			
		}
			
	}
	for (int df :arr)
	{
		System.out.println(df);
	}
	}


}
