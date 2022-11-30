package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	 
	
	public static String dateFormat()
	{
		Date date= new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("hhmmMMMdd");
		String formateddate=formatter.format(date);
		return formateddate;
	}
	

}
