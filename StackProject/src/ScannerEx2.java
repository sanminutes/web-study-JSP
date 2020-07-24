import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ScannerEx2 {
	public static void main(String[] args){

		File file = new File("hello.txt");

		try {
			FileWriter fw = new FileWriter(file);
			fw.write("hello world");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
