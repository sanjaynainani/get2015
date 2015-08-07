import java.util.*;
public class mergeSortedArray{
	int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		c=new int[asize+bsize];
		int i=0,j=0,k=0;
		while(i!=asize && j!=bsize)
		{
			if(a[i]<=b[j])
			{
				c[k]=a[i];
				k++;
				i++;
			}
			else if(a[i]>=b[j])
			{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		
			 if(i==asize)
			{while(j!=bsize)
			{   c[k]=b[j];
				j++;
				k++;
			}
			}
			else if(j==bsize)
			{while(i!=asize)
				{c[k]=a[i];
				i++;
				k++;
				}
			}

		
		return c;
	}
	public static void main(String arg[])
	{
		mergeSortedArray jsa=new mergeSortedArray ();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int n,m;
		n=sc.nextInt();
		System.out.println("enter the element of 1st array");
		int a[]=new int[n];
		for(int count=0;count<n;count++)
			a[count]=sc.nextInt();
		System.out.println("enter the size of 2nd array");
		
		m=sc.nextInt();
		System.out.println("enter the element of 2nd array");
		int b[]=new int[m];
		for(int count=0;count<m;count++)
			b[count]=sc.nextInt();
		int c[]=new int[n+m];
		for(int i=0;i<jsa.join(a,a.length,b,b.length,c).length;i++)
		{
			System.out.print(jsa.join(a, a.length,b,b.length,c)[i]+" ");
		}
		sc.close();
	}
}