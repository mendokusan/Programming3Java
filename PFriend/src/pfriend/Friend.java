package pfriend;

import java.time.LocalDate;
import java.time.Period;
//import java.util.Date;
//import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

public class Friend {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	private String homeTown;
	private String email;
	private Relationship relationshipStatus;
	private LocalDate date=LocalDate.now();
	private LocalDate dateCreated;

public Friend(String firstName,String lastName)
{
	this.firstName=firstName;
	this.lastName=lastName;
	dateCreated=LocalDate.now();
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
public int getAge()
{
	LocalDate currentDate=LocalDate.now();
	int age=Period.between(birthDate, currentDate).getYears();
	return age;
}

public boolean TheSame(Friend f1)
{
	boolean status=false;
	if(firstName.equals(f1.firstName)&&lastName.equals(f1.lastName))
	{
		status=true;
	}
	return status;
}


public String getfirstName()
{
	
	return firstName;
}
public void setfirstName(String firstName)
{
	this.firstName=firstName;
}
public String getlastName()
{
	
	return lastName;
}
public void setLastName(String lastName)
{
	this.lastName=lastName;
}
public LocalDate getBirthDate()
{
	return birthDate;
}
public void setBirthDate(LocalDate birthDate)
{
	this.birthDate=birthDate;
}
public Gender getGender()
{
return gender;
}
public void setGender(Gender gender)
{
	this.gender=gender;
}
public String getHomeTown()
{
	return homeTown;
}
public void setHomeTown(String homeTown)
{
	this.homeTown=homeTown;
}

public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email=email;
}
public Relationship getRelationshipStatus()
{
	return relationshipStatus;
}
public void setRelationshipStatus(Relationship relationshipStatus)
{
	this.relationshipStatus=relationshipStatus;
}

public LocalDate getDateCreated()
{
	return dateCreated;
}
public String toString()
{  
    StringBuilder result=new StringBuilder(firstName+" "+lastName);
    if(birthDate!=null)
    {
        result.append(" "+birthDate.toString()+" ");
    }
    
    if(gender!=null)
    {
        result.append(gender.toString()+" ");
    }
    if(homeTown!=null)
    {
        result.append(homeTown+" ");
    }
    if(email!=null)
    {
        result.append(email+" ");
    }
    if(relationshipStatus!=null)
    {
        result.append(relationshipStatus.toString());
    }
    return result.toString();
}

}

