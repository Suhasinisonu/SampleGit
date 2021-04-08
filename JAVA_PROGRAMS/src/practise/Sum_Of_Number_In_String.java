package practise;

public class Sum_Of_Number_In_String {
public static void main(String[] args){
	String no = "123";
	int value = Integer.parseInt(no);
	int sum = 0;
	
	while(value!=0){
		int rem = value%10;
		sum = sum+rem;
		value = value/10;
	}
	System.out.println(sum);
}
}
