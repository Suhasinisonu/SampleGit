package Normal_Pgm;
interface  MSoffice1
{
	void msoffice();
	
}

class MSword1 implements MSoffice1
{
  public void msoffice(){
		System.out.println("It is a PPT");
	}
}

class MSPPT1 implements MSoffice1
{
	public void msoffice()
	{
		System.out.println("It is a word");
	}
}

 class MSexcel1 implements MSoffice1
{
	public void msoffice()
	{
		System.out.println("It is a excel");
	}
}

class Stimulator1
{
	static void ansim(MSoffice1 a1){
		a1.msoffice();
	}
}
public class Abstraction {
	public static void main(String[] args) {
		MSPPT1 ppt=new MSPPT1();
		MSexcel1 xl=new MSexcel1();
		MSword1 wrd=new MSword1();
		Stimulator1.ansim(ppt);
		Stimulator1.ansim(xl);
	    Stimulator1.ansim(wrd);
}
}

