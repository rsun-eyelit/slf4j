package roger.slf4j;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Testing for SLF4J
 * @author Roger
 *
 */
public class LoggerRoot {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
//    private static final Logger logger = LoggerFactory.getLogger(LoggerRoot.class);

	/**
	 * testing
	 * @param args
	 */
	public static void main(String... args) {
		MDC.put("app",  "RogerLogger");
		IntStream.rangeClosed(1,  10).forEach(counter -> {
			logger.info("Counter: " + counter);
		});
		
		new LoggerRoot().testNullable();
	}
	
	public LoggerRoot() {} {
		String value = testNullable();
		logger.info(value);
	}
	
	private String testNullable() {
		String strA = null;
		String strB = "test";
		Optional<String> oStrA = Optional.ofNullable(strA);
		Optional<String> oStrB = Optional.ofNullable(strB);
		
		return "A+B: " + oStrA.orElse("Empty") + " " + oStrB.orElse("Empty");
	}
	
	public float divide(int i, int i2) {
		logger.debug("i: " + i + " " + "i2: " + i2);
		return i/i2;
	}
}
