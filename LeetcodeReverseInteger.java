// Leetcode - reverse integer

/*
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit 
signed integer range: [?231,  231 ? 1]. For the purpose of this problem, assume that your 
function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
        
        String s = new Integer(x).toString();
        String resp = "";
                
        if(x>0){
            for(int i = s.length(); i > 0; i--){
                resp = resp + s.substring(i-1,i);   
            }
            try{
                return Integer.parseInt(resp);
            }catch (NumberFormatException e){
                return 0;
            }            
        }
        else if(x<0){
            for(int i = s.length(); i > 1; i--){
                resp = resp + s.substring(i-1,i);                
            }
            try{
                return -Integer.parseInt(resp);
            }catch (NumberFormatException e){
                return 0;
            }
        }
        else{
            return 0;            
        }     
    }
}