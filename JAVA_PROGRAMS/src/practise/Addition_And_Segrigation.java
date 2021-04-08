package practise;

public class Addition_And_Segrigation {
public static void main(String[] args){
	String msg = "123@abc456$xyz";
	int Sum = 0;
	char[] value = msg.toCharArray();
	for(int i=0; i<value.length; i++){
		if(value[i]>='0' && value[i]<='9'){
			int n = value[i] - 48;
			Sum = Sum + n;
		}
	}
	System.out.println(Sum);
}
}
