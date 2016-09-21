package cin.ufpe.br.templates;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParserTemplate {

	public static void main(String[] args) {

		String url = "http://dblp.uni-trier.de/db/conf/msr/";

		try {
			Document doc = Jsoup.connect(url).get();
			Elements body = doc.getElementsByClass("publ-list");

			for (Element el : body) {
				Elements names = el.getElementsByClass("title");
				Elements years = el.getElementsByAttributeValue("itemprop", "datePublished");
				Elements urls = el.select("a:contains([contents])");

				for (int i = 0; i < names.size(); i++) {
					System.out.println(names.get(i).text());
					System.out.println(years.get(i).text());
					System.out.println(urls.get(i).attr("href"));
				}
			}
		} catch (IOException e) {
			System.err.println("error in parseHtml = " + url);
			System.err.println(e);
		}

	}

}
