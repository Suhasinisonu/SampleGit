package practise;

public class Another_way_to_find_least_size {
public static void main(String[] args)
{
 String msg = "welcome to india";
 String[] val = msg.split(" ");
 String varia = val[0];
 for(int i=1; i<val.length; i++){
	 
	 if(val[i].length()<varia.length()){
		 varia = val[i];
	 }
 }
 System.out.println(varia);
}
}
