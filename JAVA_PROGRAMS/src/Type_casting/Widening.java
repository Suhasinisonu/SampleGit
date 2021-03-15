package Type_casting;

public class Widening {
public static void main(String[] args) {
	System.out.println("Widening Implicitely");
	float x=20;
	System.out.println(x);
	
	double y=10.0f;
	System.out.println(y);
	
    double z=30;
    System.out.println(z);
    
    System.out.println("Widening explicitely");
    float a=(float) 20;
	System.out.println(a);
	
	double b=(double) 10.0f;
	System.out.println(b);
	
    double c=(double) 30;
    System.out.println(c);
    }
}
