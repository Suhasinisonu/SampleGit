package practise;

import java.util.ArrayList;

public class Printing_Seventeen {
public static void main(String[] args){
	int no = 20;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	for(int i=11; i<=no; i++){
		arr.add(i);
	}
	
	for(int number : arr){
		if(number%2==1){
			if(number==17){
			System.out.println("SEVENTEEN");
		}
	
		else{
			System.out.println(number);
		}
	}
	}
}
}
