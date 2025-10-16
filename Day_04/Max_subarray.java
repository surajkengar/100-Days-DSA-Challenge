import java.util.*;
public class Max_subarray{
    public static void main(String args[]){
        int[] arr ={2, 3, -8, 7, -1, 2, 3};
        int result=calculate_sub(arr);
        System.out.print(result);
    }
    static int calculate_sub(int[] temp){
        int max_sum =temp[0];
        int curr_sum =temp[0];

        for(int i=1;i<temp.length;i++){

            curr_sum =Math.max(temp[i] , curr_sum+temp[i]);

            max_sum=Math.max(max_sum , curr_sum);
        }

        return max_sum;

    }
}