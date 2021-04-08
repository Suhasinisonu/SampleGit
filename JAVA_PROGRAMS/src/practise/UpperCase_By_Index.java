package practise;

public class UpperCase_By_Index {
public static void main(String[] args){
	String msg = "india";
	
	String result = "";
	for(int i=0; i<msg.length(); i++){
		String word = "";
		if(i%2==0){
			word = word + msg.charAt(i);
			word = word.toUpperCase();
			result = result+word;
		}
		
		else {
			result=result+msg.charAt(i);
		
		}
		
		
}
	
	System.out.print(result);
}
}
