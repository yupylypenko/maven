package ingo.mysql;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class MysqlServletTest {
		
	    @Test
	    public void testConcat() {
	    	MysqlServlet myConcat = new MysqlServlet();
	        String result = myConcat.concat("Hello", "World");
	        assertEquals("HelloWorld", result);
	    }
		
	}
