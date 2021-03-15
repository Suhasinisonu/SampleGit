package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_txt {
	public static void main(String[] args) throws Exception {
		File f=new File("C://Suhasini1/sonu.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Amma");
		fw.flush();
		
	}

}
