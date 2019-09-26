import java.util.Arrays;


public class BubbleSortApp {

	static int findMax(int[]numbers) {
		
		int max=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}
		return max;
	}
	
	static int bubble(int[]numbers) {
		int number=numbers.length;
		int temp=0;
		for(int i=0;i<number;i++)
		{
			for(int j=1;j<(number-i);i++)
			{
				if(numbers[j-1]>numbers[j])
				{
					temp=numbers[j-1];
					numbers[j-1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		return temp;
	}
	
	static int selection(int[]numbers) {
		int number=numbers.length;
		int temp=0;
		for (int i=0;i<number-1;i++)
		{
			int min=i;
			for(int j=i+1;j<number;j++)
			{
				if(numbers[j]<numbers[min])
					min=j;
			}
			temp=numbers[min];
			numbers[min]=numbers[i];
			numbers[i]=temp;
		}
		return temp;
	}

}
