package stringCodes;

public class StringProcess
{
	//character count
	public int getCharCount(String s)
	{
		//System.out.println();
		int countC=0;
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(c!=',' && c!='.' && c!=';' && c!= ':' && c!='!' && c!='?' && c!=' ') 
					countC++;
		}
		return countC;
	}

	//punctuation count
	public int getPunctCount(String s) {
		
		int countP=0;
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if((c==',' || c=='.' || c==';' || c== ':' || c=='!' || c=='?') && c!=' ')
				countP++;
		}
		return countP;
	}
	
	//space count
	public int getSpaceCount(String s) {
		int countS=0;
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(c==' ') countS++;
		}
		return countS;
	}

	public int getVowelCount(String s) {
		s = s.toLowerCase();  //to reduce Comparisons
		int countV=0;
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') countV++;
		}
		return countV;
	}

	public int getConsonantCount(String s) {
		s = s.toLowerCase();  //to reduce Comparisons
		int countCo=0;
		char c;
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				continue;
			else if(c>'a' && c<='z')
				countCo++;
		}
		return countCo;
	}

	public String[] findAllSubsets(String str) {
		//char[] ch = str.toCharArray();
		int len = str.length();
		int subCount = (len*(len+1))/2;
		String sub[] = new String[subCount];
		subCount--;
		for(int pos=0;pos<len;pos++)
		{
			for(int slen=1;(pos+slen)<=len;slen++)
			{
				sub[subCount] = str.substring(pos, pos+slen);
				subCount--;
			}
		}
		return sub;
	}
	

	    //Checks for the largest common prefix  
	  public static String lcp(String s, String t)
	  {  
	        int n = Math.min(s.length(),t.length());  
	        for(int i = 0; i < n; i++)
	        {  
	            if(s.charAt(i) != t.charAt(i))
	            {  
	                return s.substring(0,i);  
	      }  
	    }  
	        return s.substring(0,n);  
	  }

	public String longestRepeatingSubstring(String str) {
		String lrs="";  
        int n = str.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring
                String x = lcp(str.substring(i,n),str.substring(j,n)); 
                System.out.println(str.substring(i,n)+" "+str.substring(j,n)+" "+x);
                //If the current prefix is greater than previous one  
                //then it takes the current one as longest repeating sequence  
                if(x.length() > lrs.length()) lrs=x;  
            }  
        }  
        return lrs; 
    }


	private void getPsetElement(String str, int start, int end) {
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			//unfinished
		}
		//return null;
	}

	//unfinished
	public String[] generatePermutations(String str) {
		
		int len = str.length(),start=0,end=len;
		int pCount = (int) Math.pow(2, len);
		String pset[] = new String[pCount];
		pCount--;
		for(int pos=0;pos<len;pos++)
		{
			getPsetElement(str,start,end);
		}
		return pset;
	}  
}