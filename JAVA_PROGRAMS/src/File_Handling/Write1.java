package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Write1 {
	public static void main(String[] args) throws Exception {
		File f1=new File("C://Suhasini1");
		if(f1.mkdirs())
			{
			  System.out.println("Folder created");
			}
		else{
			System.out.println("not created");
		}
		File f2=new File("C://Suhasini1/java1.doc");
		if(f2.createNewFile())
		{
			System.out.println("File created");
		}
		else{
			System.out.println("File not created");
		}
		
		FileWriter fw=new FileWriter(f2);
		fw.write("Amma");
		fw.flush();
		
		
	}

}
