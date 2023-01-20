package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.LogManager.*;
//import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {
	
	public static void capture_log(String classname, String message) {
		//static Logger logger = Logger.getLogger(HelloWorld.class);  
	      
		//DOMConfigurator.configure("log4j.xml"); 
		PropertyConfigurator.configure("../YTFramwork/log4j2.properties");
		Logger log=LogManager.getLogger(LogCapture.class);
		//System.out.println("hello");
		log.info(message);

	}

	}

