package practise;

public class Converting_First_Lettei_Upper {
	
public static void main(String[] args){
	String msg = "welcome to india";
	String[] word = msg.split(" ");
	
	
	
	for(int i=0; i<word.length; i++){
		
		String word2 = word[i].substring(0,1).toUpperCase()+word[i].substring(1);
		System.out.print(word2+" ");
		
	}
	
	
		
	
}
}
