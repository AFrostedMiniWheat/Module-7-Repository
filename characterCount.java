package problemsTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class characterCount {

	@Test
	public void test() {
		PJUnit2 test = new PJUnit2();
		int output = PJUnit2.main("123");
		assertEquals (2, output);
		
	}

}
