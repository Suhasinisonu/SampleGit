package Normal_Pgm;

public class Pattern_A {
public static void main(String[] args) {
	int star=4;
	int space=2;
	
	
		
		for(int h=1;h<=2;h++)
		{
			for(int j=1;j<=star;j++){
			System.out.print("*");
		}
		
		System.out.println();
			for(int k=1;k>=space;k++){
				
				if(k>=space){
				System.out.print("*");
			}
			
				else{
				System.out.print(" ");
			}
				
				
		}
			System.out.println();
			
	}
}
}




