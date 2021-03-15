package Normal_Pgm;

abstract class MSoffice
{
	abstract void msoffice();
	
}

class MSword extends MSoffice
{
	void msoffice(){
		System.out.println("It is a PPT");
	}
}

class MSPPT extends MSoffice
{
	void msoffice()
	{
		System.out.println("It is a word");
	}
}

class MSexcel extends MSoffice
{
	void msoffice()
	{
		System.out.println("It is a excel");
	}
}

class Stimulator
{
	static void ansim(MSoffice a1){
		a1.msoffice();
	}
}
public class Runtime {
public static void main(String[] args) {
	MSPPT ppt=new MSPPT();
	MSexcel xl=new MSexcel();
	MSword wrd=new MSword();
	Stimulator.ansim(ppt);
	Stimulator.ansim(xl);
    Stimulator.ansim(wrd);

}
}
