import java.util.*;
public class sort_012{
    public static void main(String args[]){
        int arr[]={0,1,1,2,2,2,0,1,1,0};
        
        sort_01(arr);
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    static void sort_01(int[] arr){
        int i=0;
        int j=arr.length-1;
        int k=0;

        while(k <= j){
            if(arr[k]==0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
                k++;

            }
            else if(arr[k]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j--;

            }
            else{
                k++;
            }
        }
    }
}