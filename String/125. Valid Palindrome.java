//use Two pointer technique

class Solution {
    public boolean isPalindrome(String s) {
        String s1="",s2="";
        int l=0,r=s.length()-1;
        while(l < r){
            
            while(l < r && !(Character.isLetterOrDigit(s.charAt(l)))){ //if not a alphanumeric character then do l++
                l++;
            }
            while(l < r && !(Character.isLetterOrDigit(s.charAt(r)))){ //if not a alphanumeric character then do r--
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }       
        return true;   
    }
}
