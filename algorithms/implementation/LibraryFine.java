package algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		
		if(y1 == y2) {
			if(m1 == m2) {
				if(d1 > d2) {
					System.out.print(15 * (d1 - d2));
				}
				else {
					System.out.print(0);
				}
			}
			else if(m1 > m2) {
				System.out.print(500 * (m1 - m2));
			}
            else {
                System.out.print(0);
            }
		}
		else if(y1 > y2) {
			System.out.print(10000);
		}
		else {
			System.out.print(0);
		}

	}


}
