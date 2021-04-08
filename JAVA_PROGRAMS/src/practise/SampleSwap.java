package practise;

public class SampleSwap {
public static void main(String[] args){
	String msg = "abc123hu56#123";
	char[] value = msg.toCharArray();
	String count="";
	String count2="";
	
	for(int i=0; i<value.length; i++){
		if(value[i]>='0' && value[i]<='9'){
			count =count+(value[i]-48);
			
			
		}else{
			count = count+count2;
		}
	}
	System.out.println(count);
	
}
}
