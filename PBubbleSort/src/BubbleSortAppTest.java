import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortAppTest {

	@Test
	void testFindMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testBubble() {
		 int[] arr = {5,8,2,3,1};

		 int[] expected = {1,2,3,5,8};

		 ArrayUtlities.bubbleSort(arr);//assuming the method is static

		 assertArrayEquals(expected, arr);
	}

	@Test
	void testSelection() {
		fail("Not yet implemented");
	}

}
