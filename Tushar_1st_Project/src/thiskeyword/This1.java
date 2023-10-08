package thiskeyword;

class This1 
{
int i;
    void firstmethod(int i)
    {
	
    i=1;
	
    }
    void show ()
    {
    	System.out.println(i);
    }
	
	public static void main(String[]  args){
		This1 obj1 =new This1();
		obj1.firstmethod(100);
        obj1.show();
	}
}
