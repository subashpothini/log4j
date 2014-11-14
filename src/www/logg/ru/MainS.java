package www.logg.ru;

import org.apache.log4j.Logger;

import www.config.ru.Config;
import www.config.ru.R;

public class MainS {
	private static String LOG_PROPERTIES_FILE = R.Log.LOG_PROPERTIES_FILE;
	private static Logger logger = Logger.getLogger(MainS.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config config = new Config(LOG_PROPERTIES_FILE);
		config.unit();
		logger.info("info =  1");
		logger.error("error = 2");
	}

}
