package cin.ufpe.br.templates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTemplate {

	public static void main(String[] args) {

		String d = "2015-11-19 19:28:49.279000000";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss.SSSSSSSSS", Locale.ENGLISH);
		LocalDateTime localDateTime = LocalDateTime.parse(d, formatter);
		System.out.println(localDateTime.toString());
		
		Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(date);
	}
}
