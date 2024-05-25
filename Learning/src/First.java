class datatype
{
	public static void main(String[] args)
	{
		int[] arr= {3,3,4,7,8};
		int n=arr.length;
		int d=5;
		int res=countTr(arr,n,d);
		System.out.println(res);
	}
	public static int countTr(int[] arr,int n,int d)
	{
		int c=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(i<j&&j<k&&(arr[i]+arr[j]+arr[k])%d==0)
					{
						c++;
					}
				}
			}
		}
		return c;
	}
}