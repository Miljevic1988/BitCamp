
public class Task3 {

	public static void main(String[] args) {
		int day1 = 01;
		int month1 = 12;
		int year1 = 2014;

		int day2 = 11;
		int month2 = 11;
		int year2 = 2014;

		if (year1 > year2) {
			System.out.println("Date " + day2 + "." + month2 + "." + year2
					+ " comes before " + day1 + "." + month1 + "." + year1);
		} else if (year1 < year2) {
			System.out.println("Date " + day1 + "." + month1 + "." + year1
					+ " comes before " + day2 + "." + month2 + "." + year2);
		}
		
		if (month1 > month2) {
			System.out.println("Date " + day2 + "." + month2 + "." + year2
					+ " comes before " + day1 + "." + month1 + "." + year1);
		} else if (month1 < month2) {
			System.out.println("Date " + day1 + "." + month1 + "." + year1
					+ " comes before " + day2 + "." + month2 + "." + year2);
		}
		
		if (day1 > day2) {
			System.out.println("Date " + day2 + "." + month2 + "." + year2
					+ " comes before " + day1 + "." + month1 + "." + year1);
		} else if (day1 < day2) {
			System.out.println("Date " + day1 + "." + month1 + "." + year1
					+ " comes before " + day2 + "." + month2 + "." + year2);
		}
		

	}


	}


