package files;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file=new File("C:\\ioFiles");
		
		if(file.exists()){
			file.delete();
			System.out.println("Deleted the file: " + file.getName());
		}else {
			System.out.println("File not deleted");
		}
	}
}
