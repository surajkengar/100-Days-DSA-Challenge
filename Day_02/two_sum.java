// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.*;
public class two_sum{
    public static void main(String args[]){
        int[]arr ={2,7,11,15};
        int target = 18;
        int [] temp =arr1(arr,target);

        System.out.println(Arrays.toString(temp));
        



    }

    static int[] arr1(int[]arr , int target){
        int []num =new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    num[0]=i;
                    num[1]=j;
                    
                    break;
                }
            }
        }
        return num;
       
    }
}