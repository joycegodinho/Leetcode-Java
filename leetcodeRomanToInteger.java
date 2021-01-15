//Leetcode - Roman to Integer

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int comp = s.length() - 1;
        int resp = 0;
        
        //aplicação de hashmap
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i = 0; i < comp; i++){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                resp = resp - map.get(s.charAt(i));
            }
            else{
                resp = resp + map.get(s.charAt(i));
            }
        }
        resp = resp + map.get(s.charAt(comp));
        return resp;


        
    }
}