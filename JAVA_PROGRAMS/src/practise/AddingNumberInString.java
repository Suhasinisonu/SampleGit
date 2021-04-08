package practise;

public class AddingNumberInString {
public static void main(String[] args){
	String word = "123ab10@y";
	int num = 0;
	int sum = 0;
	
	
	for(int i=0; i<word.length(); i++){
		
		if(word.charAt(i)>='0' && word.charAt(i)<='9'){
		int n= word.charAt(i)-48;
		num = num*10+n;
		}
	
	
	else{
		sum = sum+num;
		num=0;
	  }
	}
	System.out.println(sum);
}
}
