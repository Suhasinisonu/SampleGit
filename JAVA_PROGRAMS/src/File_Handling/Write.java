package File_Handling;

import java.io.File;

public class Write {
	public static void main(String[] args) {
		File f1=new File("C://Suhasini");
		if(f1.mkdirs()){
			System.out.println("Folder created");
		}
		else{
			System.out.println("Folder is not created");
		}
		
		if(f1.exists()){
			System.out.println("File exist");
		}
		else{
			System.out.println("File not exist");
		}
		
		if(f1.delete()){
			System.out.println("Folder deleted");
		}
		else{
			System.out.println("Folder is not deleted");
		}
	}

}
