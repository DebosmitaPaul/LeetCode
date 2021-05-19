/*
Input: s = "leetcode"
Output: 0
Input: s = "loveleetcode"
Output: 2
Input: s = "aabb"
Output: -1
 */

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter_String {
    public static void main(String[] args) {
        String s = "dddccdbba"; //""loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    static int firstUniqChar(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                int val = map.get(s.charAt(i));
                val++;
               // map[s.charAt(i)] = i;
                map.put(s.charAt(i),val);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
