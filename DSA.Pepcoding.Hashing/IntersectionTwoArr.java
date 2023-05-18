package DSA.Pepcoding.Hashing;

import java.util.HashSet;

public class IntersectionTwoArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
        int arr2[]={1,2,3,1};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set1.add(arr[i]);
        }
        for (int i=0; i<arr2.length; i++){
            set2.add(arr2[i]);
        }
        int count=0;
        for(Integer i: set1){
            if(set2.contains(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
