import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class Print2DArray here.
 * 
 * @author Ian Bryan
 * @version V1
 */
public class ShiftNumbers
{
	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer, then press Enter");
		int N = keyboard.nextInt();

		int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
		int[][] nonsquare = { {1,2,3}, {4,5}, {6,7,8,9} };
		int[][] latin = { {1,2,3}, {2,3,1}, {3,1,2} };
		int[][] notlatin = { {2,1,3}, {2,3,1}, {3,1,2} };


		// 1. Create your array dynamically here


		// 2. Now, fill the 2D array with numbers 





		// 3. Print your 2D array



		// 4. print the lower border
		for(int j = 0; j < digits[0].length; ++j) {
			System.out.print("+-");
		}
		System.out.println("+");  


	}
}
