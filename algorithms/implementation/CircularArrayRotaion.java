/*
John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the value of the element at a given index.

*/


package algorithms.implementation;

import java.util.Scanner;

public class CircularArrayRotaion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int noOfElements = in.nextInt();
		int rotationCount = in.nextInt();
		int noOfQueries = in.nextInt();
		
		int[] a = new int[noOfElements];
		
		for(int i = 0; i < noOfElements; i++) {
			a[i] = in.nextInt();
		}
		
		int[] q = new int[noOfQueries];
		
		for(int i = 0; i < noOfQueries; i++)
			q[i] = in.nextInt();
		
		for(int i = 0; i < rotationCount; i++) {
			int temp = a[a.length-1];
			
			for(int j = a.length-2; j >= 0; j--) {
				a[j+1] = a[j];
			}
			a[0] = temp;
		}
		
		for(int i = 0; i < q.length; i++) {
			System.out.println(a[q[i]]);
		}
	}

}
