class Solution {
    public int strStr(String haystack, String needle) {
        int needlelength=needle.length();
        for(int i=0;i<haystack.length()-needlelength+1;i++){
            if(haystack.substring(i,i+needlelength).equals(needle)){
                return i;
            }
            
        }
        return -1;

        
    }
}