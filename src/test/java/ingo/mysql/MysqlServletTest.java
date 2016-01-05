package ingo.mysql;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MysqlServletTest {
		
	    @Test
	    public void testConcat() {
	    	MysqlServlet myConcat = new MysqlServlet();
	        String result = myConcat.concat("Hello", "World");
	        assertEquals("HelloWorld", result);
	    }
		
	}
