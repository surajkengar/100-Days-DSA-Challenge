import java.util.*;
public class union_element{
    public static void main(String args[]){
        int[] a={1, 2, 3, 2, 1};
        int[] b={3, 2, 2, 3, 3, 2};

        ArrayList<Integer> temp2 =temp(a,b);

        
            System.out.print(temp2);
       
    }

    static  ArrayList<Integer> temp(int[]a,int[]b){

        Set<Integer> temp1 =new HashSet<>();

        for(int i=0;i<a.length;i++){
            temp1.add(a[i]);
        }
        for(int j=0;j<a.length;j++){
            temp1.add(b[j]);
        }

        ArrayList<Integer> temp =new ArrayList<>(temp1);

        Collections.sort(temp);

        return temp;
    };

}