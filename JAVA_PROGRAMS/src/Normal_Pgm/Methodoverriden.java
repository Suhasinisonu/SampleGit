package Normal_Pgm;

class Jiosaavan{
	void disp(){
		System.out.println("Only used to listen");
	}
}

class Jiosaavan_v2 extends Jiosaavan{
	void disp(){
		System.out.println("Can pod cast");
		super.disp();
	}
}

public class Methodoverriden {
public static void main(String[] args) {
	Jiosaavan_v2 apk=new Jiosaavan_v2();
	apk.disp();
}
}
