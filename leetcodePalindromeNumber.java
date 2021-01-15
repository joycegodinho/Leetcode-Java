//Determine whether an integer is a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        
        String r = new Integer(x).toString();
        char[] s= r.toCharArray();
        int i = 0;
        int j = r.length() - 1;
        boolean igual = true;

        if(r.length() > 2){

            while (j > 1 && igual){
                if (s[i]!=s[j]){
                    igual = false;
                }
                i++;
                j--;
            }
            return igual;
        }

        else if(r.length() == 2){
            if(s[0]!=s[1]){
                igual = false;
            }
            return igual;
        }
        return igual;

        
    }
}