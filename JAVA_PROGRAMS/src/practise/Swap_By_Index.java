package practise;

public class Swap_By_Index {
public static void main(String[] args){
	String msg = "welcome to india mandya";
	String[] words = msg.split(" ");
	int count = words.length;
	
	if(words.length%2!=0){
		
	count = words.length-1;
	for(int i=0; i<count; i++){
		String temp = words[i];
		words[i] = words[i+1];
		words[i+1] = temp;
		
	}
		for(int j=0; j<words.length; j++){
			System.out.print(words[j]+" ");
		}	
		
   }
	
	
	else{
		
			
		if(msg.length()%2!=0){
		count = msg.length()-1;
		}
		
		for(int i=0; i<count; i++){
			if(i%2==0){
			String temp = words[i];
			words[i] = words[i+1];
			words[i+1] = temp;
			}
	}
		for(int j=0; j<words.length; j++){
			System.out.print(words[j]+" ");
	 }
			
	}
	
}
}






