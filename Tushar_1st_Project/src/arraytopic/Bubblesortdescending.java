package arraytopic;

public class Bubblesortdescending {



	public static void bubble(int ar[]) {
		for (int i =0;i<ar.length;i++) {
			for(int j = 1;j<ar.length-i;j++) {
				if(ar[j-1]>ar[j]) {
					int temp = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
		}for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

	public static void main (String[] args){
		int ar []={10,63,85,98,65,32,58}; 
		Bubblesortdescending.bubble(ar);
	}

}



