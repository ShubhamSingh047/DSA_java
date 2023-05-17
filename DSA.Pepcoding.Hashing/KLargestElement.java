package DSA.Pepcoding.Hashing;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k= s.nextInt();
        int arr[]={2,10,5,17,7,18,6,4};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i< arr.length; i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }else{
                if(pq.peek()<arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size()>0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
