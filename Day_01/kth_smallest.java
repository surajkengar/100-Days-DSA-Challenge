// Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the kth smallest element in the given array.

// Follow up: Don't solve it using the inbuilt sort function.

// Examples :

// Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output: 7
// Explanation: 3rd smallest element in the given array is 7.
// Input: arr[] = [2, 3, 1, 20, 15], k = 4 
// Output: 15
// Explanation: 4th smallest element in the given array is 15.

import java.util.*;
public class kth_smallest{
    public static void main(String args[]){
        int arr[]={7, 10, 4, 3, 20, 15};
        int k1=3;
        int result = num(arr ,k1 );
        System.out.print(result);
    }

    static int num(int arr1[],int k){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i] > arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }

          
        }
          return arr1[k-1];
    }
}