// Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

// Examples:

// Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
// Output: [-5, 8]
// Explanation: minimum and maximum elements of array are -5 and 8.
// Input: arr[] = [12, 3, 15, 7, 9]
// Output: [3, 15]
// Explanation: minimum and maximum element of array are 3 and 15.
import java.util.Arrays;
public class min_max{
    public static void main(String args[]){
        int arr[]={-5,7,3,-7,23,12};
        int result[]= arr1(arr);
        System.out.println(Arrays.toString(result));


    }

    static int[] arr1(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }

        
        }
        int arr1[] = new int[2];
        arr1[0]=min;
        arr1[1]=max;

        return arr1; 
    }
}
