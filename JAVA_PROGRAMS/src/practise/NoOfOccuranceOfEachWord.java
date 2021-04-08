package practise;

import java.util.HashSet;

public class NoOfOccuranceOfEachWord {
	public static void main(String[] args){
		String msg = "welcome to india welcome to mandya";
		String[] word = msg.split(" ");
		int count1=0;
		
		HashSet<String> set = new HashSet<String>();{
			for(int i=0; i<word.length; i++){
				set.add(word[i]);
			}
			
			for(String character : set){
				int count = 0;
				
				for(int i=0; i<word.length; i++){
					if(character.endsWith(word[i])){
						count++;
					}
				}
				
				System.out.println(character+" "+count);

			}
		}
	}
}
