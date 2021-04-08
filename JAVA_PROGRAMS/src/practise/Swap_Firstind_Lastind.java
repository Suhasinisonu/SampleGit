package practise;

public class Swap_Firstind_Lastind {
public static void main(String[] args){
	String msg = "welcome to tyss";
	String[] splitted = msg.split(" ");
	

	for(int i=0; i<splitted.length-1; i++){
		for(int j=1; j<splitted.length; j++){
			
				String temp = splitted[i];
				splitted[i] = splitted[j];
				splitted[j] = temp;
			
		}
	}
	
	for(int n=0;n<splitted.length;n++){
		System.out.print(splitted[n]+" ");
	}
	
}
}
