import java.util.Scanner;
public class FCFSClass
{
	public static void main(String arg[])
	{
		System.out.print("Enter the number of jobs ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arrivalTime[]={1, 5, 9, 25},jobSize[]={12,7,2,5};
		
		
		FCFSClass bTO=new FCFSClass();
	bTO.FCFS(arrivalTime,jobSize);
	}
	int[][] FCFS(int arrivalTime[],int jobSize[])
	{
		int n=jobSize.length;
		int cpuStart=1,waitTime[]=new int[n],startTime[]=new int[n],finishTime[]=new int[n],startTime1;
		int result[][]=new int[n][5];
		
		
		System.out.println("job  job arrived time     Job wait time     Job Start at  Job finished at ");
		int count2;
		if(cpuStart==arrivalTime[0])
			startTime1=cpuStart;
		else if(cpuStart>arrivalTime[0])
			startTime1=cpuStart;
		else
			startTime1=arrivalTime[0];
		for(int count=0;count<n;count++)
		{
		
			if(count==0)
				{
				startTime[count]=startTime1;
				finishTime[count]=startTime[count]+jobSize[count]-1;
				waitTime[count]=0;
				continue;
				}
			if(finishTime[count-1]==arrivalTime[count])
				startTime1=finishTime[count-1];
			else if(finishTime[count-1]>arrivalTime[count])
				startTime1=finishTime[count-1];
			else
				startTime1=arrivalTime[count]-1;
			startTime[count]=startTime1+1;
			finishTime[count]=startTime[count]+jobSize[count]-1;
			waitTime[count]=startTime[count]-arrivalTime[count];
		}
		for(int count=0;count<n;count++)
		System.out.println(count+1+" \t \t "+arrivalTime[count]+"  \t\t" +waitTime[count]+"\t\t" +startTime[count]+"\t \t" +finishTime[count]);
		for(int count=0;count<n;count++)
			
			{
			result[count][0]=count+1;
			result[count][1]=arrivalTime[count];
			result[count][2]=waitTime[count];
			result[count][3]=startTime[count];
				result[count][4]=finishTime[count];
			}
		return result;
		}
}
	
	