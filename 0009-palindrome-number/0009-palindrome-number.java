class Solution {
    public boolean isPalindrome(int x) {
       String num=String.valueOf(x);
       int left=0;
       int right=num.length()-1;
       if(x<0){
        return false;
       }
       while(left<right){
        if(num.charAt(left)!=num.charAt(right))
        {
            return false;
        }
        left++;
        right--;
          
    }
       return true;
    }
}