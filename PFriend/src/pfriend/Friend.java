package pfriend;

import java.time.LocalDate;

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
public int getAge()
{
	int age=LocalDate.now().getYear()-birthDate.getYear();
	LocalDate currentDate=LocalDate.now();
			
	if(currentDate.getDayOfMonth()>birthDate.getDayOfMonth())
	{
		age--;
	}
	
	else if(currentDate.getDayOfMonth()==birthDate.getDayOfMonth())
	{
		if(currentDate.getDayOfYear()>birthDate.getDayOfYear())
		{
			age--;
		}
	}
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

public String toString()
{  
    StringBuilder result=new StringBuilder(firstName+" "+lastName+" "+birthDate+" "+gender+" "+homeTown+" "+email+" "+relationshipStatus);
    if(birthDate.equals(null))
    {
        result.append(birthDate+" ");
    }
    
    if(gender!=null)
    {
        result.append(" "+gender+" ");
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
        result.append(relationshipStatus+" ");
    }
    return result.toString();
}

}

