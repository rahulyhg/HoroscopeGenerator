package dataPopulant;

public class signImpl implements SignRetrieval {
	String url = "";
	
	public signImpl() {
		
	}

	@Override
	public String getAddress(String sign) {
		
		switch (sign) {
		case "Taurus":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=2";
			break;
		case "Aries":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=1";
			break;
		case "Gemini":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=3";
			break;
		case "Cancer":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=4";
			break;
		case "Leo":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=5";
			break;
		case "Virgo":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=6";
			break;
		case "Libra":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=7";
			break;
		case "Scorpio":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=8";
			break;
		case "Sagittarius":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=9";
			break;
		case "Capricorn":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=10";
			break;
		case "Aquarius":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=11";
			break;
		case "Pisces":
			url = "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=12";
			break;
		default:
			break;
				
		}
	
		return url;
	}
	
	
}
