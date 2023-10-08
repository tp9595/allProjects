package arraytopic;

public class BubbleSort2 {

	public static void bubble(int ar[]) {
		System.out.println("Befor Sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		for (int k =0;k<ar.length;k++) {
			for(int j = 1;j<ar.length-k;j++) {
				if(ar[j-1]<ar[j]) {//6
					int temp = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}if(k==0) {
				System.out.println("smallest number="+ar[ar.length-1]);
			}
		}System.out.println("After Descending Sorting");
		for(int i=0;i<ar.length;i++) {

			System.out.println(ar[i]);
		}

		for (int i =0;i<ar.length;i++) {
			for(int j = 1;j<ar.length-i;j++) {
				if(ar[j-1]>ar[j]) {
					int temp = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==0) {
				System.out.println("largest="+ar[ar.length-1]);
			}
		} System.out.println("After Ascending Sorting");
		for (int i=0; i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}

	public static void main (String[] args) {
		int ar[]= {60,55,56,13,99,32,95};
		BubbleSort2.bubble(ar);
	}

}
