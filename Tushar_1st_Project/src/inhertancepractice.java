
public class inhertancepractice implements Interfacepractice ,Trafficsingnal {

	@Override
	public void small() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("2"); 
	}
public static void main(String[]arg)
{
	inhertancepractice obj = new inhertancepractice();
	obj.display();
}
}
