import static org.junit.Assert.*;

import org.junit.Test;

public class STest {

	@Test
	public void test() {
		class squareTest {

			@Test
			void test() {
				JUnitTesting obj=new JUnitTesting();
				int output=obj.square(5);
				assertEquals(25, output);
			}

		}

	}

}
