package pfriend;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class FriendTest2 {

	@Test
	void testFriendStringString() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single",person.toString());
	}

	@Test
	void testFriendStringStringIntIntInt() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Nama 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single",person.toString());
	}

	@Test
	void testFriendStringStringIntIntIntGenderStringStringRelationship() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Nama 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single",person.toString());
	}

	@Test
	void testGetAge() {
		Friend person=new Friend("Erika","Namba",2000,9,22);
		assertEquals(18,person.getAge());
		
		Friend person1=new Friend("Erika","Namba",2000,9,26);
		assertEquals(18,person1.getAge());
		
		Friend person6=new Friend("Erika","Namba",2000,3,22);
		assertEquals(19,person6.getAge());
		
		Friend person8=new Friend("Erika","Namba",2000,10,22);
		assertEquals(18,person8.getAge());
	}

	@Test
	void testTheSame() {
		Friend person=new Friend("Erika","Namba");
		Friend f1=new Friend("Erika","Namba");
		Friend f2=new Friend("Sara","Niyazmand");
		assertEquals(true,person.TheSame(f1));
		assertEquals(false,person.TheSame(f2));
	}

	@Test
	void testGetfirstName() {
		Friend person=new Friend("Sara","Namba");
		assertEquals("Sara",person.getfirstName());
	}

	@Test
	void testSetfirstName() {
		Friend person=new Friend("Sara","Namba");
		person.setfirstName("Sara");
		assertEquals("Sara",person.getfirstName());
	}

	@Test
	void testGetlastName() {
		Friend person=new Friend("Sara","Namba");
		assertEquals("Namba",person.getlastName());
	}

	@Test
	void testSetLastName() {
		Friend person=new Friend("Sara","Namba");
		person.setLastName("Namba");
		assertEquals("Namba",person.getlastName());
	}

	@Test
	void testGetBirthDate() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("1999-07-25",person.getBirthDate().toString());
	}

	@Test
	void testSetBirthDate() {
		Friend person=new Friend("Erika","Nama");
		LocalDate temp = LocalDate.of(1999, 07, 25);
		person.setBirthDate(temp);
		assertEquals(temp,person.getBirthDate());
	}

	@Test
	void testGetGender() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals(Gender.Female,person.getGender());
	}

	@Test
	void testSetGender() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		person.setGender(Gender.Female);
		assertEquals(Gender.Female,person.getGender());
	}

	@Test
	void testGetHomeTown() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Isfahan",person.getHomeTown());
	}

	@Test
	void testSetHomeTown() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		person.setHomeTown("Isfahan");
		assertEquals("Isfahan",person.getHomeTown());
	}

	@Test
	void testGetEmail() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("nambe1@student.op.ac.nz",person.getEmail());
	}

	@Test
	void testSetEmail() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		person.setEmail("nambe1@student.op.ac.nz");
		assertEquals("nambe1@student.op.ac.nz",person.getEmail());
	}

	@Test
	void testGetRelationshipStatus() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals(Relationship.Single,person.getRelationshipStatus());
	}

	@Test
	void testSetRelationshipStatus() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		person.setRelationshipStatus(Relationship.Single);
		assertEquals(Relationship.Single,person.getRelationshipStatus());
	}

	@Test
	void testGetDateCreated() {
		Friend person=new Friend("Erika","Nama",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("2019-08-22",person.getDateCreated().toString());
	}

	@Test
	void testToString() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single",person.toString());
		
		Friend person8=new Friend("Erika","Namba");
		assertEquals("Erika Namba",person8.toString());
	}

}
