package practise;

public class SplittingString {
public static void main(String[] args){
	String s = "my name is raj";
	String[] value = s.split(" ");
	String rev="";
	
	for(int i=value.length-1; i>=0; i--){
		//rev = rev+" "+value[i];
		System.out.print(value[i]+" ");
	}
	//System.out.println(rev);
}
}
