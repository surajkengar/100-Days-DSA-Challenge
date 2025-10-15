import java.util.*;
public class move_clockwise{
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5};
        result(arr);
    }
    static void result(int[] arr1){
        int i=0;
        int j=arr1.length-1;

        while(i < arr1.length-1){
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;

        }

        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
    }
}