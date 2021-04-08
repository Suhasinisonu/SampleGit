package practise;

public class AddingTwoArray {

public static void main(String[] args){
	
	int arr[] = {1,2,3};
	int arr1[] = {1,2,3,4,5};
	int sum[] = new int[arr.length];

for(int i=0; i<arr1.length; i++){
	for(int j=0; j<arr1.length; j++){
		if(j==i){
		sum[i] = arr[i]+arr1[i];
		
	}else{
		try{
			sum[i]=arr1[i];
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
		}
	}
}
	


for(int k=0;k<arr.length;k++){
	System.out.print(sum[k]);
}
}
}
