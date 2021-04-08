package practise;

import java.util.HashSet;

public class Adding_Two_numbers {
public static void main(String[] args){
	int[] arr = {4,2,3,5,6,1,4,1};
	int sum = 7;
	HashSet<Integer> set = new HashSet<Integer> ();
	for(int value : arr){
		set.add(value);
	}
	
	int[] arr1 = new int[set.size()];
	int count = 0;
	for(int value : set){
		arr1[count] = value;
		count++;
	}
	
	for(int i=0; i<arr1.length-1; i++){
		
		for(int j=i+1; j<arr1.length; j++){
			
			if(arr1[i]+arr1[j]==sum){
				System.out.println(arr1[i]+" "+arr1[j]);
			}
		}
	}
	
	
	

}
}
