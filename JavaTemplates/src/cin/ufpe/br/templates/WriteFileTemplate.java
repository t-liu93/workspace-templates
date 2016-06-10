package cin.ufpe.br.templates;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFileTemplate {

	public static void main(String[] args) {

		/*********** JAVA 7+ ***************/
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"))) {
			writer.write("something");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
