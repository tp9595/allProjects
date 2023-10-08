package constructor;

public class SuperDemo2 {
	
	



	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.printColor();

	}

}
 class Animal{
	String color = "Black";
	
	 Animal(){												// Animal Constructor  -> Parent
		System.out.println("Insider Animal default constructor");
	}
	
	Animal(String color){									// Animal Constructor  -> Parent
		this();
		System.out.println("Insider Animal parameterised constructor");
	}
	
	void printColor(){
		System.out.println("super method Color: " +color);

	}
}

 class Dog extends Animal{
	String color = "white";
	
	protected Dog(){													// Dog constructor -> Child
		//super();
		super()	;									// super keyword with Constructor
		System.out.println("Inside Dog constructor");
	}
	
	void printColor(){
		System.out.println("Child Color: " +color);
		System.out.println("Color: " +super.color); 		//super keyword with variable
		
		super.printColor();									// super keyword with method
	}
	
	
}