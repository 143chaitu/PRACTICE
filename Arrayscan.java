package javalearning;

import java.util.Scanner;

public class Arrayscan {

	public static void main(String[] args) {
		int []x=new int[4];
		int []y=new int[4];
		int []z=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array1:");
		for(int i=0;i<=3;i++){
			x[i]=sc.nextInt();// TODO Auto-generated method stub
		}System.out.println("Enter the array1:");
		for(int i=0;i<=3;i++){
			y[i]=sc.nextInt();// TODO Auto-generated method stub
		}
		for(int i=0;i<=3;i++) {
			z[i]=x[i]+y[i];
			System.out.print(z[i]+" ");
		}
		

	}

}
