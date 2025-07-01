package com.trishala.sde_sheet;

import java.util.Arrays;

public class SetMatrixZero
{
	public static void main(String[] args)
	{
		int[][] matrix = { { 1, 0, 1, 1 }, { 0, 1, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 1 } };

		/*	Brute force approach - traverse entire matrix then mark the 0 occuring rows and cells with -1 
		*	except the 0th cell but this approach assumes that the matrix will never contain -1 value
		*	TC = O(n^3)
		*/

		//	Better approach - create tracker arrays for row and columns 
		//	TC = O(n^2)

		//		int[] rowTracker = new int[matrix.length];
		//		int[] colTracker = new int[matrix[0].length];
		//		for(int row = 0; row<matrix.length; row++) {
		//			for(int col=0; col<matrix[0].length; col++) {
		//				if(matrix[row][col]==0) {
		//					rowTracker[row]=1;
		//					colTracker[col]=1;
		//				}
		//			}
		//		}
		//		System.out.println(Arrays.toString(rowTracker));
		//		System.out.println(Arrays.toString(colTracker));
		//		for(int row = 0; row<matrix.length; row++) {
		//			for(int col=0; col<matrix[0].length; col++) {
		//				if(colTracker[col]==1 || rowTracker[row]==1) {
		//					matrix[row][col]=0;
		//				}
		//			}
		//			System.out.println(Arrays.toString(matrix[row]));
		//		}
		//		

		//		Optimal Approach
		//		Instead of using to external arrays to keep the track of rows and columns why not use the arrays inside 
		//		we will use the first column and first row of the matrix for keeping the track of all rows and columns
		//		1. Mark the first row, first column and col0 varible based on matrix
		//		2. Mark the cells from (1,1) -> (m-1, n-1) based on the trackers
		//		3. Mark the first row and column if col0 is 0

		int col0 = 1;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				if (matrix[row][col] == 0)
				{
					if (col == 0)
					{
						col0 = 0;
					}
					else if (row == 0)
					{
						matrix[row][0] = 0;
					}
					else
					{
						matrix[row][0] = 0;
						matrix[0][col] = 0;
					}
				}
			}
		}

		//		Now we have marked the first trackers
		//		for (int row = 0; row < matrix.length; row++)
		//		{
		//			System.out.println(Arrays.toString(matrix[row]));
		//		}

		for (int row = 1; row < matrix.length; row++)
		{
			for (int col = 1; col < matrix[0].length; col++)
			{
				if (matrix[row][0] == 0
						|| matrix[0][col] == 0)
				{
					matrix[row][col] = 0;
				}
			}
		}

		if (col0 == 0)
		{
			for (int col = 1; col < matrix[0].length; col++)
			{
				matrix[0][col] = 0;
			}
			for (int row = 0; row < matrix.length; row++)
			{
				matrix[row][0] = 0;
			}
		}

		for (int row = 0; row < matrix.length; row++)
		{
			System.out.println(Arrays.toString(matrix[row]));
		}

	}

}
