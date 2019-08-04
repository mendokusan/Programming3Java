package pbox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	@Test
	void testBoxDoubleDoubleDouble() {
		Box box3=new Box(5);
		assertEquals("The height is 5.0.The width is 5.0.The length is 5.0.",box3.toString());
	}

	@Test
	void testBoxDoubleDouble() {
		Box box3=new Box(5);
		assertEquals("The height is 5.0.The width is 5.0.The length is 5.0.",box3.toString());
	}

	@Test
	void testBoxDouble() {
		Box box3=new Box(5);
		assertEquals("The height is 5.0.The width is 5.0.The length is 5.0.",box3.toString());
	}

	@Test
	void testGetHeight() {
		Box box2=new Box(2,6);
		assertEquals(6,box2.getHeight());
				
	}

	@Test
	void testGetWidth() {
		Box box3=new Box(4,7,8);
		assertEquals(7,box3.getWidth());
	}

	@Test
	void testGetLength() {
		Box box5=new Box(6);
		assertEquals(6,box5.getLength());
	}

	@Test
	void testSetHeight() {
		Box box9=new Box(6,9);
		box9.setHeight(9);
		assertEquals(9,box9.getHeight(),0.001);
	}

	@Test
	public void testSetWidth() {
		Box box1=new Box(2);
		box1.setWidth(5);
		assertEquals(5,box1.getWidth(),0.001);
	}

	@Test
	void testSetLength() {
		Box box4=new Box(4,7,2);
		box4.setLength(2);
		assertEquals(2,box4.getWidth(),0.001);
	}

	@Test
	void testCalcVolume() {
		Box box10=new Box(2,2,2);
		assertEquals(8,box10.calcVolume(),0.001);
	}

	@Test
	void testCalcSurfaceArea() {
		Box box11=new Box(3,4,7);
		assertEquals(122,box11.calcSurfaceArea(),0.001);
	}

	@Test
	void testToString() {
		Box box12=new Box(5,5,5);
				assertEquals("The height is 5.0.The width is 5.0.The length is 5.0.",box12.toString());
	}

}
