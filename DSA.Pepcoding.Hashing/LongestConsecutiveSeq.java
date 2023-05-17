package DSA.Pepcoding.Hashing;

import java.util.HashMap;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int arr1[]={10,5,9,1,11,8,6,15,3,12,2};
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i:arr1){
            map.put(i,true);
        }
        for(int i:arr1){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
        }
        int maxl=0;
        int maxval=0;
        for(int i:arr1){
            if(map.get(i)){
                int tempM=1;
                int tempV=i;
                while(map.containsKey(tempV+tempM)){
                    tempM++;
                }
                if(tempM>maxl){
                    maxl=tempM;
                    maxval=tempV;
                }
            }
        }
        while(maxl>0){
            System.out.println(maxval);
            maxval++;
            maxl--;
        }
    }
}
