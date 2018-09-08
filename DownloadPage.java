package dataPopulant;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DownloadPage implements SignRetrieval{
	
	//make a singleton as we only want one obj of this to be running
	private SignRetrieval signImpl;
	private static DownloadPage instance;
	
	private DownloadPage() {
		signImpl = new signImpl();
		
	}
	
	public static DownloadPage instanceOf() {
		if (instance == null) {
			instance = new DownloadPage();
		}
		return instance;
	}
	
	

	public static String fromWeb(String URL) throws IOException {
		String horoscope = "";
		Element myE = null;

		if (URL != null || URL != "") {
			Document doc = Jsoup.connect(URL).get();
		
			Elements con = doc.getElementsByClass("horoscope-content");
	
			myE = con.first();	//take only the first element 
			Elements e = myE.getElementsByTag("p");
			Element finalE = e.first();
		
			horoscope = finalE.text();
		}
		
		return horoscope;

	}
	
	public String getAddress(String sign) {
		return signImpl.getAddress(sign);
	}
	

	
}
