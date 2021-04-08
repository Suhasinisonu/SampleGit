package practise;

public class SortAndMin {

public static void main(String[] args){
		
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
		
		//Get 1st minimum
		System.out.println("First minimum");
		System.out.println(arr[arr.length-1]);
		
		//Get 2nd maximun
		System.out.println("Second minimum");
		System.out.println(arr[arr.length-2]);
		
		//Get 3rd maximun
		System.out.println("Third minimum");
		System.out.println(arr[arr.length-3]);
		
		//Get 4th maximun
		System.out.println("Fourth minimum");
		System.out.println(arr[arr.length-4]);
	}
}
