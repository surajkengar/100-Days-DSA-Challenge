import java.util.*;
public class move_negative{
    public static void main(String args[]){
        int []arr ={1, -1, 3, 2, -7, -5, 11, 6 };
        sort(arr);

    }

    static void sort(int[]arr){
        int[]temp=new int[arr.length];
        int k=0;
        for(int i=0;i<temp.length;i++){
            if(arr[i] >= 0){
                temp[k]=arr[i];
                k++;
            }
        }

        for(int j=0;j<temp.length;j++){
            if(arr[j] < 0){
                temp[k]=arr[j];
                k++;
            }
        }

        
            System.out.print(Arrays.toString(temp));
        
    }

}