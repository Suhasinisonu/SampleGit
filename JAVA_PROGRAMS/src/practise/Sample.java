package practise;

public class Sample {
public static void main(String[] args){
	String msg = "welcome to india";
	String[] word = msg.split(" ");
	int count = 0;
	
	for(int i=0; i<word.length-1; i++){
		for(int j=0; j<word.length; j++){
		if(word[j].length()>word[i].length()){
			count = word[i].length();
		}
	}
		
}
	System.out.println(count);	
}
}
