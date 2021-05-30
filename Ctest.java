import static org.junit.Assert.*;

import org.junit.Test;

public class Ctest {

	@Test
	public void test() {
		class squareTest {

			@Test
			void test() {
				JUnitTesting obj=new JUnitTesting();
				int output=obj.countA("asfdasdfa");
				assertEquals(4, output);
			}

		}

	}

}
