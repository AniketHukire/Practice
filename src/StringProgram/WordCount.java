package StringProgram;

public class WordCount {
	public static void main(String [] args) {
		String s ="I was Planning to go to pune but I Finally decided to leave for Mumbai";
		
		
		s=s.toLowerCase();
		String[] words=s.split(" ");
		int count[]=new int[words.length];
		
		for( int i=0; i<words.length; i++)
		{
			if(count[i]==-1) 
				continue;
			
			   count[i]=1;
			
			
			for(int j=i+1; j< words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count[i]++;
					count[j]=-1;
				}
			}
		}
		
		System.out.println("Total number of Word: "+words.length);
		
		
		System.out.println(" Word and its Count");
		for(int i= 0; i<words.length; i++)
		{
			if( count[i] !=-1)
			{
				System.out.println(words[i] +":"+count[i]);
			}
			
		}
		
		int max=0;
		String MaxWord="";
		for (int i=0; i< words.length; i++)
		{
			if(count[i]>max)
			{
				max=count[i];
				MaxWord=words[i];
			}
		}
		System.out.println("Max time Occurred word is "+MaxWord+" That count is "+max);
		
		
	}

}
