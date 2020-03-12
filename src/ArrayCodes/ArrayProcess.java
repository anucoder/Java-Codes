package ArrayCodes;

public class ArrayProcess
{
	//int arr[];
	
	public void arrayTraverse(int[] arr)
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public int findFrequency(int[] arr,int item)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
				count++;
		}
		
		return count;
	}
	
	//left rotate arr by n position and return new array
	public void leftRotate(int arr1[],int n)
	{
		for(int i=0;i<n;i++) {
			int first = arr1[0];
			int j = arr1.length;
			for(int pos=1;pos<j;pos++)
			{
				arr1[pos-1] = arr1[pos];
			}
			arr1[j-1] = first;
		}	
	}
	
	//right rotate arr by n position
	public void rightRotate(int arr2[],int n)
	{
		int j = arr2.length;
		for(int i=0;i<n;i++) {			
			int last = arr2[j-1];
			for(int pos=j-1;pos>0;pos--)
			{
				arr2[pos] = arr2[pos-1];
			}
			arr2[0] = last;
			//arrayTraverse(arr2);
		}				
	}

	//find duplicate elements in array
	public void findDuplicate(int[] arr) {
		boolean dfound = false;
		for(int pos=0;pos<arr.length;pos++)
		{
			dfound = false;
			for(int i=pos+1;i<arr.length;i++)
			{
				if(arr[pos]==arr[i])
				{
					dfound = true;
					break;
				}
			}
			if(dfound)
				System.out.print(arr[pos]+" ");
		}
		
	}
	
	//find duplicate elements in array
	public int remDuplicate(int[] arr) {
		//boolean dfound = false;
		int len= arr.length;
		for(int pos=0;pos<arr.length;pos++)
		{
			//dfound = false;
			for(int i=pos+1;i<arr.length;i++)
			{
				if(arr[pos]==arr[i])
				{
					//dfound = true;
					//break;
					int j;
					for(j=i+1;j<arr.length;j++)
					{
						arr[j-1]=arr[j];
						
					}
					//arr[arr.length-1]='\0';
					len--;
				}
			}
			//if(dfound)
				//System.out.print(arr[pos]+" ");
		}
		return len;
	}


	public int findSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}

	public int findLargest(int[] arr) {
		int lar = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(lar<arr[i]) lar = arr[i];
		}
		return lar;
	}
	
	//n represents the how laregest is the number
	public int findLargest(int[] arr,int n) {
		int lar = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(lar<arr[i]) lar = arr[i];
		}
		return lar;
	}
	
	public int findSmallest(int[] arr) {
		int small = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i]) small = arr[i];
		}
		return small;
	}
	//n represents the how smallest is the number
	public int findSmallest(int[] arr,int n) {
		int small = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i]) small = arr[i];
		}
		return small;
	}

}