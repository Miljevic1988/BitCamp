import java.text.SimpleDateFormat;
import java.util.Date;
public class Task6 {

	public static void main(String[] args) {
		 
		Date date = new Date();
	      String strDateFormat = "HH:mm a";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      System.out.println(sdf.format(date));
	   }
	
	}


