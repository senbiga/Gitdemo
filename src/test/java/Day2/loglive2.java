package Day2;


import org.apache.logging.log4j.*;

public class loglive2 {
	
	private static Logger log =LogManager.getLogger(loglive2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			log.debug("I am chocolate");
				log.info("i am good");
					log.fatal("LOve");
						log.error("error");
	}

}
