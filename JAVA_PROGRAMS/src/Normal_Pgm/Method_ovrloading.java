package Normal_Pgm;

class Method
{
	static void order(int cost){
		System.out.println("cost of rice is 500");
	}
	static void order(String item){
		System.out.println("Iphone ordered");
	}
	
	static void order(int cost, String item){
		System.out.println("cost of biscuit is 20");
	}
	static void order(String item, int cost){
		System.out.println("Coke is 20");
	}
}

public class Method_ovrloading {
public static void main(String[] args) {
	Method.order(500);
	Method.order("Iphone");
	Method.order(20, "biscuit" );
	Method.order("COke", 20);
	
  }
}

