package variables;



		public abstract class AnnonymousFun {
			public AnnonymousFun() {
			System.out.println("Default");
			}
			abstract int add (int a ,int b);//abstract class
			abstract int subs (int a ,int b);//abstract class

			public static void main(String[] args) {
				//AnnonymousFun obj = new AnnonymousFun();//error
				AnnonymousFun obj =new AnnonymousFun() {
					int add (int a ,int b) {
						System.out.println(a+b);
						return a+b;
					}
					int subs (int a ,int b) {
						System.out.println(a-b);
						return a-b;

					}
					
				};
				obj.add(12,15);
				obj.subs(89,85);
				

			}

		

	}


