package pfriend;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Friend {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	private String homeTown;
	private String email;
	private Relationship relationshipStatus;
	private LocalDate date=LocalDate.now();

public Friend(String firstName,String lastName)
{
	this.firstName=firstName;
	this.lastName=lastName;
}

public Friend(String firstName,String lastName,int year,int month,int day)
{
	this(firstName,lastName);
	birthDate=LocalDate.of(year, month, day);
}
public Friend(String firstName,String lastName,int year,int month,int day,Gender gender,String homeTown,String email,Relationship relationshipStatus)
{
	this(firstName, lastName,year,month,day);
	this.gender=gender;
	this.homeTown=homeTown;
	this.email=email;
	this.relationshipStatus=relationshipStatus;
}
public void getAge()
{
	int age=LocalDate.now().getYear()-birthDate.getYear();
	if()
	
	
}
public void TheSame()
{
	boolean status=true;
	if(firstName==lastName)
	{
		status=false;
	}
	
}

public String toString()
{
	if(firstName==null)
	{
		
	}
	return "Name:"+firstName+" "+lastName+"DOB:"+birthDate+" "+"Gender:"+gender+""+"Home Town"+homeTown+" "+"Email:"+email+" "+"Relationship Status"+relationshipStatus+" "+"Date:"+date;
}

}

