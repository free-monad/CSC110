import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
  public static Timestamp convertStringToTimestamp(String strDate) {
    try {
      DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date date = formatter.parse(strDate);
      Timestamp timeStampDate = new Timestamp(date.getTime());

      return timeStampDate;
    } catch (ParseException e) {
      System.out.println("Exception :" + e);
      return null;
    }
  }

  public static double cleanFieldToDouble(String field){
    return Double.parseDouble(field.replace("\"", "").trim());
  }

  public static int cleanFieldToInt(String field){
    return Integer.parseInt(field.replace("\"", "").trim());
  }

  public static String cleanField(String field){
    return field.replace("\"", "").trim();
  }

  public static final String CSV_START_LINE = "\"";
  public static final String CSV_SEPARATOR = "\", \"";
  public static final String CSV_END_LINE = "\"\n";

}
