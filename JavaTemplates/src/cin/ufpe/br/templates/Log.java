package cin.ufpe.br.templates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

	private final Logger logger = Logger.getLogger(Log.class.getName());
	private FileHandler fh = null;

	public Log() {
		SimpleDateFormat format = new SimpleDateFormat("y-M-d");
		try {
			fh = new FileHandler("./logs/code.review." + format.format(Calendar.getInstance().getTime()) + ".log");
		} catch (Exception e) {
			e.printStackTrace();
		}

		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);
	}

	public void doInfoLogging(String msg) {
		logger.info(msg);
	}

	public void doSevereLogging(String msg) {
		logger.severe(msg);
	}

	public void doWarningLogging(String msg) {
		logger.warning(msg);
	}

	public void doFineLogging(String msg) {
		logger.fine(msg);
	}

	public static void main(String[] args) {
		Log log = new Log();
		log.doInfoLogging("logando!!");
	}
}
