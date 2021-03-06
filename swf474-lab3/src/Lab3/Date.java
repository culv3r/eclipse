package Lab3;
import java.util.*;

public class Date implements Comparable<Date>{
	private String line, numDate;
	
	public Date(String line){
		this.line = line;
		this.numDate = convertToNumDate(line);
	}
	@Override
	public int compareTo (Date other){
		return 0;
	}
	
	public String convertToNumDate(String line){
		System.out.println("This is converting " + line + " to a num date.");
		StringTokenizer st = new StringTokenizer(line);
		String month = "";
		String day = "";
		int year = 0;
		int numDays = 0;
		int tokenCount = 0;
		String token = "";
		String numDate = "";
		while (st.hasMoreTokens()){
			token = st.nextToken();
			if (month.equals("") && tokenCount == 0){
			System.out.println("." + token + ".");
			token = token.toLowerCase();
			if (token.equals("january")||token.equals("jan")||token.equals("jan."))
				month = "01";
			}
			else if (token.equals("february")||token.equals("feb")||token.equals("feb.")){
				month = "02";
			}
			else if (token.equals("march")||token.equals("mar")||token.equals("mar.")){
				month = "03";
			}
			else if (token.equals("april")||token.equals("apr")||token.equals("apr")){
				month = "04";
			}
			else if (token.equals("may")||token.equals("may.")){
				month = "05";
			}
			else if (token.equals("june")||token.equals("jun")||token.equals("jun.")){
				month = "06";
			}
			else if (token.equals("july")||token.equals("jul")||token.equals("jul.")){
				month = "07";
			}
			else if (token.equals("august")||token.equals("aug")||token.equals("aug.")){
				month = "08";
			}
			else if (token.equals("september")||token.equals("sept")||token.equals("sept.")
					||token.equals("sep")||token.equals("sep.")){
				month = "09";
			}
			else if (token.equals("october")||token.equals("oct")||token.equals("oct.")){
				month = "10";
			}
			else if (token.equals("november")||token.equals("nov")||token.equals("nov.")){
				month = "11";
			}
			else if (token.equals("december")||token.equals("dec")||token.equals("dec.")){
				month = "12";
			}else{
				System.out.println("I still can't find the month.");
			}
		
		if (day.equals("") && tokenCount == 1){
			switch (month) {
            case "01":
            case "03":
            case "05":
            case "07":
            case "08":
            case "10":
            case "12":
                numDays = 31;
                break;
            case "04":
            case "06":
            case "09":
            case "11":
                numDays = 30;
                break;
            case "02":
            	//will address leap year once year token is received.
                numDays = 29;
                break;
            default:
            	System.out.println("Number of days can't be determined.");
                numDays = -1;
                break;
			}
			StringBuilder sb = new StringBuilder(token);
			sb.deleteCharAt(sb.indexOf(","));
			token = sb.toString();
			System.out.println(token + "This is stringbuilder");
			int tempDays = Integer.parseInt(token);
			if (tempDays > numDays)
				day = "-1";
			if (day.equals("-1"))
				return "-1";
			if (tempDays < 10)
				day = "0" + token;
			return day;
		}
		if(year == 0 && tokenCount == 2){
			year = Integer.parseInt(token);
			if (month.equals("02")){
				if (((year % 4 == 0) && 
	                     !(year % 100 == 0))
	                     || (year % 400 == 0))
	                    numDays = 29;
	                else
	                    numDays = 28;
				int tempDay = Integer.parseInt(day);
				if (tempDay > numDays)
					return "-1";
			}
			if (year > 2199 || year < 1900)
				return "-1";
		}
		tokenCount++;
		}
		
		numDate = (token + "-" + month + "-" + day);
		System.out.print("numDate: " + numDate);
		return numDate;
	}
	@Override
	public String toString() {
		return "Date: " + line;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getNumDate() {
		return numDate;
	}
	public void setNumDate(String numDate) {
		this.numDate = numDate;
	}
	

}
