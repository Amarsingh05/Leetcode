class Solution {
    public int scoreOfString(String s) {
        int result=0;
        for (int i=0;i<s.length()-1;i++){
            
        int ch1=s.charAt(i);
        int ch2=s.charAt(i+1);
        int diff=Math.abs(ch1-ch2);
        result+=diff;
        }
        
    return result;
    }
}