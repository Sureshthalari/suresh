package p1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class SimpleDate_Format {

	public static void main(String[] args) {
		String pattern="MM-dd-yyy";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String date=sdf.format(new Date());
        System.out.println("Current Date::"+date);
        //local DateTime format
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Current DateAndTime::"+ldt);
        
        
        //another way 
        Date date1 = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate= formatter.format(date1);  
        System.out.println(strDate);  
	}

}
