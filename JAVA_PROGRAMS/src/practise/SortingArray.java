package practise;

public class SortingArray {

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
		
		System.out.println("===============");
		
		//Get 1st maximum
		System.out.println("1st maximum");
		System.out.println(arr[0]);
		
		System.out.println("===============");
		
		//Get 2nd maximun
		System.out.println("2nd maximum");
		System.out.println(arr[1]);
		
		System.out.println("===============");
		
		//Get 3rd maximun
		System.out.println("3rd maximum");
		System.out.println(arr[2]);

		System.out.println("===============");
		
		//Get 4th maximun
		System.out.println("4th maximum");
		System.out.println(arr[3]);
	}
}
