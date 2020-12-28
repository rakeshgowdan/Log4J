package com.rakesh.logEx;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log4jExample{

	   /* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(log4jExample.class);
	   
	   public static void main(String[] args)throws IOException{
		  // BasicConfigurator.configure();
	      log.debug("Hello this is a debug message "+new Date());
	      log.info("Hello this is an info message "+new Date());
	      
	   }
	}