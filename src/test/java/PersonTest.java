import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

/**
 * Created by ybaytler on 7/12/16.
 */
public class PersonTest {
	Person person;

	@Before
	public void setUp() {
		person = new Person("bob", 30);
		System.out.println("person initialized");
	}

	@Test
	public void test1() {
		int age2 = person.compute();
		assertEquals(age2, 31);
	}

	@Test
	public void test2(){
		assert(person, new Person("bob", 30));
//		assertEquals("bob", person.name);
	}

	@Ignore("test is too slow")
	@Test
	public void test3() {
		int age2 = person.compute2();
		assertEquals(age2, 32);
	}

	@Test
	public void test4() {
		assumeTrue("a".equals("b"));
		assertEquals("aaa", "bbb");
	}
}