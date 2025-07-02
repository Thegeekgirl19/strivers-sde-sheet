package com.trishala.sde_sheet;

import java.util.Arrays;

/*
observation 1:
The next permutation will have the longest prefix match 
till the dip is observed from the end

observation 2:
find the next largest element to replaced with the dip element 
and swap dip with that item

obeservation 3: 
Reverse everything after the dip element to get the next permutation
*/

public class NextPermutation
{
	public static void main(String[] args)
	{
//		int[] arr = { 2, 1, 3, 4, 5 };
		int[] arr = {1,3,2};

		//		finding dip index
		int index = -1;
		for (int i = arr.length - 2; i >= 0; i--)
		{
			if (arr[i] < arr[i + 1])
			{
				System.out.println(i);
				index = i;
				break;
			}
		}

		if (index == -1)
		{
			reverse(arr, 0, arr.length-1);
		} else {
			
			for (int i = arr.length -1; i >= 0; i--)
			{
				if (arr[i] > arr[index])
				{
					swap(arr, i, index);
					break;
				}
			}
			
			reverse(arr, index+1, arr.length-1);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void swap(int[] arr, int i, int j)
	{
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void reverse(int[] arr, int ii, int jj) {
		while(ii<jj && jj>=0 && ii<=arr.length) {
			swap(arr, ii, jj);
			ii++;
			jj--;
		}
	}
}
