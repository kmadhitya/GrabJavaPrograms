package com.secondset.javaprogram;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,10,2,3,1,0};
		int n= arr.length;
		int k=4;
		System.out.println(maxSum(arr,n,k));
	}
	
	public static int maxSum(int arr[], int n, int k)
    {
        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }
  
        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];
  
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
  
        return max_sum;
    }

}
