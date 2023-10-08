package programpractice;

public class starpattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
			System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <= n; j++) {
					System.out.print("*");
				}
				for (int j = i; j <n; j++) {
					System.out.print("*");
				}
				System.out.println();
			
			
			
			
			
		// System.out.println();
	}

	// for incresing triangle just change j condition insted of n put i

	}}
