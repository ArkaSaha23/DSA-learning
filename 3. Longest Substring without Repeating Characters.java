class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen=0,len=0,left=0,right=0,n=s.length();
        while(right < n)
        {
            char ch = s.charAt(right);
            
            if(map.containsKey(ch) && map.get(ch) >= left)           //if the character is found in the hashmap and
            {                                                        //if its value(index) is greater than left pointer then only update the left pointer
                left = map.get(ch) + 1 ;           
            }
            map.put(ch,right);
            len = right - left +1;
            maxLen=Math.max(maxLen,len);
            right = right + 1;
        }
        return maxLen;
    }
}
