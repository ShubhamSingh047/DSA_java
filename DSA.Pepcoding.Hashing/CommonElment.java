package DSA.Pepcoding.Hashing;

import java.util.HashMap;

public class CommonElment {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,2,3,4,5,2,3,4,5};
        int arr2[] = {1,1,2,3,45,2, 9 ,0 ,8 , 8 , 7,2,3,4};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            if(map1.containsKey(i)) {
                map1.put(i,map1.get(i)+1);
            }else{
                map1.put(i,1);
            }
        }

        for(int i: arr2){
            if(map1.containsKey(i)){
                System.out.print(i+" ");
                map1.remove(i);
            }
        }
    }
}
