package practise;

public class Segrigation_Using_Array {
public static void main(String[] args){
	String msg = "123@abc456$xyzdft456F";
	String Capitalalpha = "";
	String Smallalpha = "";
	String numbers = "";
	String special = "";
	
	char[] character = msg.toCharArray();
	
	for(int i=0; i<character.length; i++){
		if(character[i]>='A' && character[i]<='Z'){
			Capitalalpha=Capitalalpha+msg.charAt(i);
		}else if(character[i]>='a' && character[i]<='z'){
			Smallalpha=Smallalpha+msg.charAt(i);
		}else if(character[i]>='0' && character[i]<='9'){
			numbers=numbers+msg.charAt(i);
		}else{
			special = special+msg.charAt(i);
		}
	}
	System.out.println(Capitalalpha);
	System.out.println(Smallalpha);
	System.out.println(numbers);
	System.out.println(special);
}
}
