package practise;

public class ConverTOUpperCase {
public static void main(String[] args){
	String msg = "india";
	char[] letter = msg.toCharArray();
	String s2="";
	
	for(int k=0; k<letter.length; k++){
		s2 = s2+letter[k];
		if(s2=="i"){
			
			  s2 = s2.toUpperCase();				  
			  }
		else{
			s2 = s2+letter[k];
		}
	}
	System.out.println(s2);
	/*for(int i=0; i<msg.length(); i++){
		if(msg.charAt(i)=='i'){
			char c=msg.charAt(i);
			s2 = s2+(c+"").toUpperCase();
		}else{
			s2=s2+msg.charAt(i);
		}
	}
	System.out.println(s2);	*/
}
}
