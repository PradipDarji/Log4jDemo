package Log4jJavaDemo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo4j2 {

	private static Logger Log = LogManager.getLogger(Demo4j2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.info("This is info log Demo4j2.");
		Log.debug("This is debug log Demo4j2.");
		Log.error("This is error log Demo4j2.");
		Log.fatal("This is fatal log Demo4j2.");
		Log.warn("This is warn log Demo4j2.");

	}

}
