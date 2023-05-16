package DSA.Pepcoding.Hashing;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert Operations
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        System.out.println(hm);

        //Get Operations (Find)
        int res=hm.get("India");
        System.out.println(res);

        //Contains Key return boolean
        System.out.println(hm.containsKey("India"));

        //remove Operation
        System.out.println(hm.remove("China"));

        //Size of Hashmap
        System.out.println(hm.size());

        //check if HashMap is empty
        System.out.println(hm.isEmpty());

        //Clear our hashmap / delete
        hm.clear();
    }
}
