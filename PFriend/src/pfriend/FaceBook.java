package pfriend;

import java.util.*; 

public class FaceBook {
	private Friend friend;
	//Friend[]imaginaryFriends=new Friend[5000];
	ArrayList<Friend> manybots=new ArrayList<Friend>();
	String Identifier;

	public FaceBook(String firstName,String lastName,int year,int month,int day,Gender gender,String homeTown,String email,Relationship relationshipStatus,String Identifier)
	{
		Friend bot1=new Friend("None","Existent",1999,7,25,Gender.Other,"Neverland","anemail@gmail.com",Relationship.Single);
		Friend bot2=new Friend("Some","Ghost",1999,7,25);
		Friend bot3=new Friend("Another","Individual");

	}
	
	public String getIdentifier()
	{
		return Identifier;
	}
	
	public void setIdentifier()
	{
		this.Identifier=Identifier;
	}
	public void numberOfFriends(int number)
	{
		for(int i=0;i<=imaginaryFriends.length;i++)
		{
			number=i;
		}
	}
	public void addFriend(Friend f1)
	{
		if(manybots.indexOf(f1)>0)
		{
		manybots.add(f1);
		}

	}
	public String displayFriend(Friend f1)
	{
		StringBuilder result=new StringBuilder();
		for(Friend item:manybots)
		{
			result.append(item.toString());
		}
		return result.toString();
				
	}
	public String Under21NoBirthdays(String under21)
	{
		if(friend.getAge()<20)
		{
			StringBuilder result=new StringBuilder();
			for(Friend item:manybots)
			{
				result.append(item.toString());
			}
			under21=result.toString();	
		}
		return under21;
	}
	public void RemoveFriend(Friend f1,Friend f2)
	{
		boolean match=false;
		int indexNumber=0;
		//String name;
		for(Friend item:manybots)
		{			
			if(manybots.contains(f2))
			{
				indexNumber=manybots.indexOf(item);
				match=true;
			}
			
			
		}
		if(match=true)
		{
			manybots.remove(indexNumber);
		}
		
		//get index of Friend friend and store in index number
		//Check is friend,isTheSame(f1)
		//
	}

	
	
}
