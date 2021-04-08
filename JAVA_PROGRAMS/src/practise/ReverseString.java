package practise;

public class ReverseString {
	
	static String rev = "";
	
	static void reverse(String msg){
	   for(int i=msg.length()-1; i>=0; i--){
		   rev = rev + msg.charAt(i);
	   }
	  System.out.println(rev);
	}
	
public static void main(String[] args){
	
	String msg = "INDIA";
	
	for(int i=msg.length()-1; i>=0; i--){
		System.out.print(msg.charAt(i));
	}
	
	System.out.println();
	reverse("JAVA");
	
}
}
