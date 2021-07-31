package Log4jJavaDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo4j {

	private static Logger Log = LogManager.getLogger(Demo4j.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.info("This is info log Demo4j1.");
		Log.debug("This is debug log Demo4j1.");
		Log.error("This is error log Demo4j1.");
		Log.fatal("This is fatal log Demo4j1.");
		Log.warn("This is warn log Demo4j1.");

	}

}
