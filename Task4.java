
public class Task4 {

		public static int getNumDate(String month, int day) 
		{
		
		int numDate = 0;

		 

		if(month == "january")
		{ numDate = 0 + day; }
		else if(month == "febuary")
		{ numDate = 31 + day; }
		else if(month == "march")
		{ numDate = 59 + day; }
		else if(month == "april")
		{ numDate = 90 + day; }
		else if(month == "may")
		{ numDate = 120 + day; }
		else if(month == "june")
		{ numDate = 151 + day; }
		else if(month == "july")
		{ numDate = 181 + day; }
		else if(month == "august")
		{ numDate = 212 + day; }
		else if(month == "setember")
		{ numDate = 243 + day; }
		else if(month == "october")
		{ numDate = 273 + day; }
		else if(month == "november")
		{ numDate = 304 + day; }
		else if(month == "december")
		{ numDate = 334 + day; }
		return numDate;
		}
		public static String getZodiac(int date)
		{
		String zodiac = null;
		if(date >=80 && date<=110)
		{ zodiac = "aries"; }
		else if(date >=111 && date<=141)
		{ zodiac = "taurus"; }
		if(date >=142 && date<=172)
		{ zodiac = "gemini"; }
		if(date >=173 && date<=203)
		{ zodiac = "cancer"; }
		if(date >=204 && date<=234)
		{ zodiac = "leo"; }
		if(date >=235 && date<=265)
		{ zodiac = "virgo"; }
		if(date >=296 && date<=325)
		{ zodiac = "libra"; }
		if(date >=296 && date<=325)
		{ zodiac = "scorpio"; }
		if(date >=326 && date<=355)
		{ zodiac = "sagittarius"; }
		if(date >=356 || date<=19)
		{ zodiac = "capricorn"; }
		if(date >=20 && date<=49)
		{ zodiac = "aquarius"; }
		if(date >=50 && date<=79)
		{ zodiac = "pisces"; }
		return zodiac;
		}
		
		public static void main(String[] args)
		{
			int res1 = getNumDate("july",31);
		
		
		 System.out.println(getZodiac(res1));
		}
}


		
		 

		 

		

		 
		 
		
			 
	