package practise;

import java.util.HashSet;

public class TotalNoOfCountOfDuplicateNo {
	public static void main(String[] args){
		String msg = "INDIA";
		char[] cha = msg.toCharArray();
		int count1=0;
		
		HashSet<Character> set = new HashSet<Character>();{
			for(int i=0; i<cha.length; i++){
				set.add(cha[i]);
			}
			
			for(Character character : set){
				int count = 0;
				
				for(int i=0; i<cha.length; i++){
					if(character==cha[i]){
						count++;
					}
				}
				
				if(count>1){
					
					count1++;
				}
			}
			System.out.println(count1);
		}
	}
}
