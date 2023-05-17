package DSA.Pepcoding.Hashing;

import java.util.HashMap;

public class IntersectionArr {
    public static void main(String[] args) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int arr1[]={1,1,1,2,2,3,3,3,3,4,5};
        int arr2[]={1,1,2,2,2,3,3,4};

        for(int i=0; i< arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(map.get(arr2[i])>0){
                map.put(arr2[i], map.get(arr2[i])-1);
                System.out.println(arr2[i]);
            }
        }
    }
}
