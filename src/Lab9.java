import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Lab9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab9  {

    public static void main(String [] args) {


        // Test random matrix of integers
        int[][] a = randomMatrix (7, 20, 100);
        // use the above array to test next rowSum()
        int rowTotal = rowSum( a, 3);
        System.out.println("\n Sum of row  = " + rowTotal);

        // use the above array to test next colSum()
        int columSum = colSum( a, 4);
        System.out.println("\n Sum of columns  = " + columSum);

        isSquare(a);
        
        int[][] nonsquare = { {1,2,3}, {4,5}, {6,7,8,9} };
        int[][] notlatin = { {2,1,3}, {2,3,1}, {3,1,2} };
        int[][] latin = { {1,2,3}, {2,3,1}, {3,1,2} };
        int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
        int[][] notSquare = { {10, 12, 3, 17}, { 4, 5, 16, 18}, { 7, 9, 10, 45} };
        int[][] perfectSquare = { {1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12}, { 13, 14, 15, 16}};

        // Your tests, here are 2 to start with
        //isLatin(nonsquare);
        //isSquare(nonsquare);

    }

	/*
	 * <p>This method will return a 2D array with random
	 * numbers in rows and columns within a specified range.
	 * 
	 * Using the Random methods ints(arg1, arg2) which takes two integer arguments
	 * and findFirst which operates on the IntStream to allow for conversion (casting)
	 * to integer values. Then add them to the array.
	 * </p>
	 * 
	 * @param N - The random number of rows and columns to create an
	 * array with.
	 * @param start - the first cell in the row
	 * @param end - the last cell in the row
	 * */
	public static int[][] randomMatrix(int N, int start, int end){
		int[][] a = new int[N][N];
		Random r = new Random();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				a[i][j] = r.ints(start, (end+1)).findFirst().getAsInt();
			}
		}
		return a;
	}

	/*
	 * <p>This method will return the sum of all of the elements
	 * within a given row.
	 * 
	 * The rowSum is set to 0 for each column that's passed until
	 * it reaches the 3rd row. Then the final iteration returns
	 * the sum of the third row and exits
	 * </p>
	 * 
	 * @param a - a 2D array that is iterated over row by row
	 * @param i - the row to inspect
	 * */
	public static int rowSum(int [][] a, int i) {
		int rowSum = 0;
		for(int x=0;x<a.length;x++) {
			rowSum = 0;
			for(int j=0;j<=i;j++) {
				rowSum += a[i][j];
			}
		}
		return rowSum;
	}

	/*
	 * <p>This method will do something similar as the previous method, but instead
	 * will total up the sum of a column specified by the parameter 'j'</p>
	 * 
	 * @param a - a 2D array that is iterated over to get the sum of a column
	 * @param j - the column to inspect
	 * */
	public static int colSum(int[][] a, int j) {
		int colSum = 0;
		for(int x=0;x<a[j].length;x++) {
			colSum += a[j][x];
		}
		return colSum;
	}

	/*
	 * This method will return true or false depending on the condition that array is a 
	 * square meaning the number of rows and columns are the same.
	 * 
	 * */
	public static boolean isSquare(int[][] a) {
		boolean isSameSize = false;
		int rowSize = a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i].length == rowSize) {
				System.out.println("# of items in row: " + a[i].length
						+ "||# of colms: " + rowSize);
				isSameSize = true;
				
				return true;
			}else {
				return false;
			}
		}
		return isSameSize;
	}

	/*
	 * This method will return true or false depending on the condition that the columns
	 * and rows contain values 1-N without repeats. 
	 * 
	 * Example: 1 2 3 4 5
	 * 			2 3 4 5 6
	 * 			3 4 5 6 7
	 * 
	 * */
	public static boolean isLatin(int[][] a) {


	}

  }