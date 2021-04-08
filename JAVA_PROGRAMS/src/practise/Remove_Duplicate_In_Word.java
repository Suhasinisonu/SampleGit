package practise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicate_In_Word {
public static void main(String[] args){
	String msg = "welcome to india welcome to mandya";
	String[] value = msg.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String> ();
	for(int i=0; i<value.length; i++){
		set.add(value[i]);
	}
	
	for(String word : set){
		System.out.print(word+" ");
	}
}
}
