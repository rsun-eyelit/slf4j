package roger.slf4j;

//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testing
 * @author Roger
 *
 */
@DisplayName("Logger Test")
public class LoggerRootTest {
	
	private final LoggerRoot loggerRoot = new LoggerRoot();
	
	@Test
	@DisplayName("demo test😱")
	@Disabled("test")
	public void test1() {
		LoggerRoot.main();
	}
	
	@Test
	@DisplayName("exception test divide by zero")
	void execptionTesting() {
		Exception exception = assertThrows(ArithmeticException.class, () ->  
			loggerRoot.divide(1,  0) );
		
		assertEquals("/ by zero", exception.getMessage());
	}
}
	