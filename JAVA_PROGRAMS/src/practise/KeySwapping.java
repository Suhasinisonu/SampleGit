package practise;

public class KeySwapping {
public static void main(String[] args){
	int key=2;
	int[] ary = {10,20,30,40,50};
	for(int j=0; j<key; j++){
	for(int i=0; i<ary.length-1; i++){
		
		int temp = ary[i];
		ary[i] = ary[i+1];
		ary[i+1] = temp;
	}
  }
	for(int i=0; i<ary.length; i++){
		System.out.print(ary[i]+" ");
	}
}

}
