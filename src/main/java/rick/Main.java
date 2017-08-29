package rick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Main{
	
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String args[]){
		System.out.println("abcd");
		logger.info("test info");
		logger.debug("debug info");
	}
	
}