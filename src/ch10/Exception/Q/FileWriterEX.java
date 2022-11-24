package ch10.Exception.Q;

public class FileWriterEX {

	public static void main(String[] args) {
		try(FileWriter08 fileW = new FileWriter08("file.txt")){
			fileW.write("Java");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
