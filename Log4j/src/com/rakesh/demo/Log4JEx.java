package com.rakesh.demo;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;

public class Log4JEx {

	static Logger log = Logger.getLogger(Log4JEx.class.getName());  
    
	   public static void main(String[] args)throws IOException{   
	      log.trace("Trace Message!"+new Date());  
	      log.debug("Debug Message!"+new Date());  
	      log.info("Info Message!"+new Date());  
	      log.warn("Warn Message!"+new Date());  
	      log.error("Error Message!"+new Date());  
	      log.fatal("Fatal Message!"+new Date());  
	      
	   }  
}

