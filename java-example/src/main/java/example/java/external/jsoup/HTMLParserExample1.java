package example.java.external.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by 1532082 on 4/16/2017.
 */
public class HTMLParserExample1 {

    public static void main(String[] args) {

        Document doc;
        try {

            // need http protocol
            doc = Jsoup.connect("http://10.20.235.98:1080").get();

            // get page title
            String title = doc.title();
            System.out.println("title : " + title);

            System.out.print(doc.text());

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
