package Logdemo;


import org.apache.logging.log4j.*;

public class loglive {
	
	private static Logger log =LogManager.getLogger(loglive.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			log.debug("I am chocolate");
				log.info("i am good");
					log.fatal("LOve");
						log.error("error");
	}

}
