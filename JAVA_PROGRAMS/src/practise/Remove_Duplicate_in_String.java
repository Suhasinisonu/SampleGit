package practise;

import java.util.LinkedHashSet;

public class Remove_Duplicate_in_String {
public static void main(String[] args){
	String msg = "india";
	char[] value = msg.toCharArray();
	LinkedHashSet<Character> set = new LinkedHashSet<Character> ();
	for(int i=0; i<value.length; i++){
		set.add(value[i]);
	}
	
	for(Character word : set){
		System.out.print(word);
	}
}
}
