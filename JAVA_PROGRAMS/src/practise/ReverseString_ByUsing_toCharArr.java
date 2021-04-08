package practise;

public class ReverseString_ByUsing_toCharArr {

public static void main(String[] args){
	
	String msg = "JAVA";
	char[] chr = msg.toCharArray();
	String rev = "";
	
	for(int i=0; i<msg.length(); i++){
		rev = chr[i] + rev;
	}
	System.out.println(rev);
	
	String s = "india";
	String s1 = "xyz";
	System.out.println("s value");
	System.out.println(s.compareTo(s1));
	System.out.println(s1.compareTo(s));
   
	String x = "india";
    String x1 = "ind";
    System.out.println("x value");
    System.out.println(x.compareTo(x1));
	System.out.println(x1.compareTo(x));
	
	String y = "india";
	String y1 = "a";
	System.out.println("y value");
	System.out.println(y.compareTo(y1));
	System.out.println(y1.compareTo(y));
	
	String z = "india";
	String z1 = "india";
	System.out.println("z value");
	System.out.println(z.compareTo(z1));
	System.out.println(z1.compareTo(z));
	
}
}
