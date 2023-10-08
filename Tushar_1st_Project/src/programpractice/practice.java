package programpractice;

public class practice {
public static void main(String[] args) {
	returnStringArray();
}
	
	public static String[] returnStringArray() {
		String ar[] = {"abc","def","ghi","\"jkl mno pqr\"","stu","\"xyz uvw shr\""};
		String arNew[] = new String[ar.length];
		//String ar1[]= ar;
		//int j=0;
	//	for(int i=0; i<ar.length; i++) {
	//	arNew[i]=ar[i];
		//++;
		//}
		for(int k=0; k<ar.length; k++) {
			System.out.println(ar[k]);
		}
		return ar;
	}
}
