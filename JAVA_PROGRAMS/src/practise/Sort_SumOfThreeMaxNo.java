package practise;

public class Sort_SumOfThreeMaxNo {
public static void main(String[] args){
		
	int sum = 0;
		int[] arr = {20,50,84,10};
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
		for(int n=0;n<arr.length;n++){
			System.out.println(arr[n]);
		}
	
		for(int n=0; n<3; n++){
			
			sum = sum+arr[n];
		}
		
		System.out.println("Sum of first three max");
		System.out.println(sum);
   }	
}
