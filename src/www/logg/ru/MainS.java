package www.logg.ru;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import www.config.ru.Config;
import www.config.ru.R;
import www.interf.ru.IPrint;

public class MainS {
	private static String LOG_PROPERTIES_FILE = R.Log.LOG_PROPERTIES_FILE;
	private static Logger logger = Logger.getLogger(MainS.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Config config = new Config(LOG_PROPERTIES_FILE);
		config.unit();
		logger.info("Runn...");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"bean.xml");
		IPrint prt = (IPrint) applicationContext.getBean("hello");
		prt.print();

		// Single single = Single.getInstantce();
		Single single = (Single) applicationContext.getBean("single");
		double d = single.pow(7);
		System.out.println("pow 7 = " + d);
		// IPrint iPrint = new Printer("hello");
		// iPrint.print();

	}
}
