package USS.Com;
import java.io.*;

public class ThrowsExample {
	static void readFile() throws IOException{
		FileReader file = new FileReader("tst.txt");     // May throw FileNotFoundException
		
		BufferedReader br = new BufferedReader(file);
		System.out.println(br.readLine());
	}

	public static void main(String[] args) {
		try {
			readFile();
		}
		catch(IOException e) {
			System.out.println("Exception handled:"+e);
			
		}

	}

}
