package javalearning;

import java.util.Scanner;

public class Arrayfinding {

	public static void main(String[] args) {
		boolean b = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		int[]x= new int[4];
		for(int i=0;i<=3;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println("Enter the key: ");
		int y=sc.nextInt();
		for(int i=0;i<=3;i++)
		{
			if(y==x[i]) {
				b=true;
			}
		}
		if(b==true) {
			System.out.println("The number is matched");
		}else {
			System.out.println("The number is not matched");
		}
// TODO Auto-generated method stub

	}

}