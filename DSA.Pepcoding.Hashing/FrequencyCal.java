package DSA.Pepcoding.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        //filling our hashmap with input string
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch)+1;
                map.put(ch, freq);
            }else{
                map.put(ch,1);
            }
        }

        //now checking for max freq
        int maxfreq = map.get(str.charAt(0));
        char maxchar = str.charAt(0);
        for(Character key: map.keySet()){
            if(map.get(key)>maxfreq){
                maxfreq=map.get(key);
                maxchar=key;
            }
        }
        System.out.println(maxchar+" :- "+maxfreq);
    }
}
