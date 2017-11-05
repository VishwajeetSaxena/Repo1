package com;

import org.apache.log4j.Logger;

import com.base.Base;

public class LogInit {
	
	
public Logger log;
	
	public void initLogs(){
		CommonUtils utl = new CommonUtils();
		System.setProperty("logFilePath",utl.readProperties(Base.propFile,"logFilePath"));
		System.setProperty("htmlFilePath",utl.readProperties(Base.propFile,"htmlFilePath"));
		
		log = Logger.getLogger(this.getClass().getName());
	}

}
