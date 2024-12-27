package javaTest.customSorting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class DateTest {

	


	     public static void main(String []args){
	          Date date = new Date();
	            //HH_15Sep_01.15_327692.pdf
	            System.out.println(" "+date);
		    SimpleDateFormat form = new SimpleDateFormat("ddMM_HHmmss");
		   // form.setTimeZone(TimeZone.getTimeZone("IST"));
		    String strDate = form.format(date);
	        System.out.println(" "+strDate);
	     }
	
}
