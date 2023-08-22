package javalearning;

public class Arraysorting {

	public static void main(String[] args) {
		int [] x={11,13,12,15,14};//given array;
		
		for(int i=0;i<=4;i++)//to check the array one by one 
		{
			for(int j=i+1;j<=4;j++)
			{
				
				if(x[i]>x[j])//checking the condition;
				{
				int temp;//creating the temporary value;
				temp=x[i];//assigning the temporary value;
				x[i]=x[j];
				x[j]=temp;
				}
				// TODO Auto-generated method stub
			}
			
		}
		System.out.println("The sorted array was :");
		for(int k:x) {
			System.out.print(k+" ");
		}
		
	}

}