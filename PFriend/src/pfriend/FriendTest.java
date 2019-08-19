package pfriend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FriendTest {

	@Test
	void testFriendStringString() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single Female Isfahan nambe1@student.op.ac.nz Single ",person.toString());
	}

	@Test
	void testFriendStringStringIntIntInt() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single Female Isfahan nambe1@student.op.ac.nz Single ",person.toString());
	}

	@Test
	void testFriendStringStringIntIntIntGenderStringStringRelationship() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single Female Isfahan nambe1@student.op.ac.nz Single ",person.toString());
	}

	@Test
	void testGetAge() {
		Friend person=new Friend("Erika","Namba",2000,8,15);
		assertEquals(19,person.getAge());
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
	void testToString() {
		Friend person=new Friend("Erika","Namba",1999,7,25,Gender.Female,"Isfahan","nambe1@student.op.ac.nz",Relationship.Single);
		assertEquals("Erika Namba 1999-07-25 Female Isfahan nambe1@student.op.ac.nz Single Female Isfahan nambe1@student.op.ac.nz Single ",person.toString());
		
	}

}
