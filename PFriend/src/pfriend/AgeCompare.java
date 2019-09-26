package pfriend;

import java.util.Comparator;

public class AgeCompare implements Comparator<Friend> {

	@Override
	public int compare(Friend f1, Friend f2) {
		if(f1.getBirthDate()==null&&f2.getBirthDate()==null)
		
		return 0;
		if(f1.getBirthDate()==null)
			return 1;
		if(f2.getBirthDate()==null)
			return -1;
		return f1.getBirthDate().compareTo(f2.getBirthDate());

		
	}
	

}
