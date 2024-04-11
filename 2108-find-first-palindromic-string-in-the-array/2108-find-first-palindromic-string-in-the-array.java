class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(ispalindrom(word)){
                return word;
            }
        }
        return "";
    }
    public boolean ispalindrom(String s){
        int front=0;
        int rear=s.length()-1;
        while(front<rear){
            if(s.charAt(front)!=s.charAt(rear)){
                return false;
                
            }
            front++;
            rear--;
        }
        return true;
    }
}