package psalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {


	@Test
	void testSalary() {
	
	}
	

	@Test
	void testGetGross() {
		Salary box3=new Salary(5);
		assertEquals(5,box3.getGross());
	}

	@Test
	void testSetGross() {
		Salary box3=new Salary(6);
		assertEquals(6,box3.getGross());
	}

	@Test
	void testGetTax() {
		Salary box3=new Salary(80000);
		assertEquals(17320.00,box3.getTax());
	}
	
	@Test
	void testGetTax1() {
		Salary box1=new Salary(17000);
		assertEquals(1,995.00,box1.getTax());
	}

	@Test
	void testGetTax2() {
		Salary box1=new Salary(9000);
		assertEquals(945.00,box1.getTax());
	}
	
	@Test
	void testGetTax3() {
		Salary box1=new Salary(34000);
		assertEquals(4970.00,box1.getTax(),0.10);
	}

	@Test
	void testGetNet() {
		Salary box3=new Salary(80000);
		assertEquals(62680.00,box3.getNet());
	}
	
	@Test
	void testGetNet1() {
		Salary box3=new Salary(9000);
		assertEquals(8055.00,box3.getNet());
	}


}
