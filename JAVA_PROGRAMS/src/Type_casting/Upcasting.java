package Type_casting;

class Demo
{
	void disp()
	{
		System.out.println("Suhasini");
	}
}

class Sample extends Demo
{
	int a=10;
}



public class Upcasting {
public static void main(String[] args) {
	
	
	Demo s1=new Sample();
	s1.disp();
	
	Sample down=(Sample) s1;
	down.disp();
	System.out.println(down.a);
	
	
}
}
