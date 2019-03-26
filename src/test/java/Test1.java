import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {



	@Ignore
	@Test
	public void test1() {
		assertEquals("aaa", "aaa");
	}

	@Ignore
	@Test (timeout = 1)
	public void test2() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		assertEquals("aaa", "aaa");
	}

	@Ignore
	@Test
	public void test3() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			assertEquals(i % 2, 0);
		}
	}





	/*
	assertEquals
	assertNotSame

	assertTrue
	assertFalse

	assertNull
	assertNotNull

	assertArrayEquals

	assertThat("abc", both(containsString("a")).and(containsString("b")));
	assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));

	*/
}
