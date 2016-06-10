package cin.ufpe.br.templates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileTemplate {

	public static void main(String[] args) {

		/*********** JAVA 8 ***************/
		try {
			String content = new String(Files.readAllBytes(Paths.get("./codereviews-android/103241.json")));
			System.out.println(content);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		/*********** JAVA 6- ***************/
		BufferedReader br = null;
		String everything = "";
		try {
			StringBuilder sb = new StringBuilder();
			br = new BufferedReader(new FileReader("C:/Users/Felipe/Desktop/android-review-236130.json"));
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			everything = sb.toString();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
		System.out.println(everything);
	}
}
