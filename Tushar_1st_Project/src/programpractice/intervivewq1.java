package programpractice;

public class intervivewq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "i am panakj";
		String b = "";
		char ch[] = a.toCharArray();
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				b = b + "@";
				str = str + b;
				System.out.println(str);
			}
//			} else {
//				str = str + ch[i];
//				System.out.println(str);
//			}

		}
		//System.out.println(str);

	}

}
