package practise;

public class Reverse {
public static void main(String[] args){
	String msg = "welcome to tyss";
	String[] word = msg.split(" ");
	
	
    		
			for(int j=0; j<word.length; j++){
			String wrd = word[j];
			String rev="";
			for(int i=wrd.length()-1;i>=0;i--){
	         rev = rev+wrd.charAt(i);
	 }
			System.out.print(rev+" ");
			}
	
			
}
}

