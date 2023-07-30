package tan.le.shop1.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatter {
  private static SimpleDateFormat formatter;
  
  public static Date dateFormatter(String date) throws ParseException {
    formatter = new SimpleDateFormat("yyyy-MM-dd");
    return formatter.parse(date);
  }
  public static LocalDateTime datetimeFormatter(String date) throws ParseException {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	    LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
	    return dateTime;
	  }
}
