/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;

import java.util.Scanner;

public class AreaOfTriangle {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		double base, height;
		float area;

		System.out.print("Enter the value of base :");
		base = input.nextDouble();

		System.out.print("Enter the value of height :");
		height = input.nextDouble();

		area = (float) (0.5 * base * height);
		System.out.printf("The area of triangle is : %.2f", area);

	}

}
