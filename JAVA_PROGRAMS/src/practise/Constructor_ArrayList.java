package practise;

public class Constructor_ArrayList {
public static void main(String[] args){
int no = 247;
int number = no;
int count = 0;

while(number!=0){
	count++;
	number = number/10;
}
  for(int i=1; i<=count; i++){
	  int fact = 1;
	  number = no;
	  for(int j=1; j<=count; j++){
		  int digit = number%10;
		  if(i!=j){
			  fact = fact * digit;
			 
		  }
		  number = number/10;
	  }
	  System.out.print(fact+" "); 
  }

}
}
