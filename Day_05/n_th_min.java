import java.util.*;
public class n_th_min{
    public static void main(String args[]){
        int arr[]={10,50,2,8,3,5};
        int n=4;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        for(int j=n;j<arr.length;j++){
            
            if(arr[j]<pq.peek()){
                pq.poll();
                
                pq.add(arr[j]);
            }
        }

        System.out.print(pq.peek());

        

        // while(!pq.isEmpty()){
        //     System.out.println(pq.poll());
        // }

        
    }
}