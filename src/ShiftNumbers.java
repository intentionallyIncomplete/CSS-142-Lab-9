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
		int M = keyboard.nextInt();

		/*declaring new 2D array with M rows and columns*/
		int[][] digits = new int[M][M];

		/*populating the array*/
		for(int i=0;i<digits.length;i++) {
			for(int j=0;j<digits[i].length;j++) {
				digits[i][j] += j+1;
			}
		} 

		int[] lastElement = digits[digits.length-1];
		int lastIndex = lastElement[lastElement.length-1];
		System.out.println(lastIndex);
		
		/*print the array*/
		for(int i=0;i<digits.length-1;i++) {
			System.out.println();
			/*Lower border*/
			for(int x = 0; x < digits[0].length; x++) {
				System.out.print("+-");
			}
			System.out.println("+");
			
			for(int j=0;j<digits[i].length;j++) {
				System.out.print(digits[i][j]+"|");
			}
		}
	}
}