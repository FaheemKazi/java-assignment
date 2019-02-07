package multiplejavafiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.lang.*;
import java.util.*;

class mainTest {

	@Test
	public void test(){
		{
		subclass test=new subclass();
		int output=test.add(2,3);
		assertEquals(5,output);
	}
	
	{
		subclass test=new subclass();
		int output=test.sub(2,3);
		assertEquals(-1,output);
		
	}
	
	{
		subclass test=new subclass();
		int output=test.mul(2,3);
		assertEquals(6,output);
		
	}
	
	
	{
		
		subclass test=new subclass();
		int output=test.div(25,5);
		assertEquals(5,output);
		
	}
	}

}