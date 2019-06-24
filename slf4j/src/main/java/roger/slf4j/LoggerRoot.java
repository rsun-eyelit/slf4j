package roger.slf4j;

import java.lang.invoke.MethodHandles;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LoggerRoot {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
	
	public static void main(String... args) {
		MDC.put("app",  "RogerLogger");
		IntStream.rangeClosed(1,  10).forEach(counter -> {
			logger.info("Counter: " + counter);
		});
	}
}
