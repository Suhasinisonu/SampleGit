package Normal_Pgm;

class Sample{
	private int Phonepepin=1234;
	
	public int getPhonepepin(){
		return Phonepepin;
	}
	
	public void setPhonepepin(int Phonepepin){
		this.Phonepepin=Phonepepin;
	}
}

public class Encapsulation {
public static void main(String[] args) {
Sample encap=new Sample();
int disp = encap.getPhonepepin();
System.out.println(disp);
encap.setPhonepepin(2345);
int disp1 = encap.getPhonepepin();
System.out.println(disp1);
}
}
