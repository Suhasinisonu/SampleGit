package Normal_Pgm;

class Bookmyshow
{
	void ticket(){
		System.out.println("ticket booked");
	}
}

public class Radhakrishna {
	public static void main(String[] args) {
		Bookmyshow ref=new Bookmyshow();
		User1.book(ref);
		User2.book(ref);
	}

}

class User1
{
	static void book(Bookmyshow ref1){
		ref1.ticket();
	}
}

class User2
{
	static void book(Bookmyshow ref2){
		ref2.ticket();
	}
}