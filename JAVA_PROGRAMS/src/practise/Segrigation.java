package practise;

public class Segrigation {
public static void main(String[] args){
	String msg = "123@abc456$xyz";
	String alpha = "";
	String numbers = "";
	String special = "";
	for(int i=0; i<msg.length(); i++){
		if(Character.isAlphabetic(msg.charAt(i))){
			alpha=alpha+msg.charAt(i);
		}else if(Character.isDigit(msg.charAt(i))){
				numbers=numbers+msg.charAt(i);
			}else {
				special=special+msg.charAt(i);
			}
	}
	System.out.println(alpha);
	System.out.println(numbers);
	System.out.println(special);
}
}
