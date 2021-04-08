package practise;

public class Replace_I_with_P {
public static void main(String[] args){
	String msg = "india";
	char[] character = msg.toCharArray();
	
	for(int i=0; i<character.length; i++){
		if(character[i]=='i'){
			character[i]='P';
		}
		
	}
	
	for(int j=0; j<character.length; j++){
		System.out.print(character[j]);
	}
}
}
