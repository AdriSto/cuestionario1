package com.adr.ad;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ejemplo {

	public static void main(String[] args) {
		
		String zona = ZonedDateTime.now().getZone().toString();
		
		 System.out.println(ZonedDateTime.now());
	      
	       System.out.println("Get current timezone "+zona);
	        
	        System.out.println("Get time of different timezone: "+ZonedDateTime.now(ZoneId.of("America/New_York")));



	}

}
