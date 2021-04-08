package practise;

public class AddingTOString {
public static void main(String[] args){
	String word1 = "123";
	String word2 = "100";
	String result = "";                       
	                                           
	for(int i=0; i<word1.length(); i++){
		 int number1 = word1.charAt(i)-48;
		 int number2 = word2.charAt(i)-48;
		 result = result+(number1+number2);
	}
	System.out.println(result);
}

}
