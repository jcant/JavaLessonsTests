package com.gmail.gm.jcant;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogginExceptions {
	private static Logger logger = Logger.getLogger("LogginExceptions");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
		logger.info(trace.toString());
	}
}
