package www.config.ru;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class Config {
	private static String logFile;
	private static Properties logProperty = new Properties();

	@SuppressWarnings("static-access")
	public Config(String logFile) {
		this.logFile = logFile;
	}

	public void unit() {
		try {
			logProperty.load(new FileInputStream(logFile));
			PropertyConfigurator.configure(logProperty);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
