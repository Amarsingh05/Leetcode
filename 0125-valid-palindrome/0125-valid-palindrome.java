class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) ||Character.isDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String newstr=sb.toString();
        int start=0;
        int end=newstr.length()-1;
        
        while(start<end){
            if(newstr.charAt(start)!=newstr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}