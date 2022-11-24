package ch10.Exception.Q;

import java.io.IOException;

public class FileWriter08 implements AutoCloseable {
	
	public FileWriter08(String filePath) throws IOException {
		System.out.println(filePath + " 파일을 엽니다.");
	}

	public void write(String data) throws IOException {
		System.out.println(data + "를 파일에 저장합니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("파일을 닫습니다.");
		
	}
	
}
