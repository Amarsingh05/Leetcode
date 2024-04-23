class Solution {
public:
    bool isPalindrome(int x) {
        string num=to_string(x);
        
        int start=0;
        int end=num.length()-1;
        
        while(start<end){
            if(num.at(start)!=num.at(end)){
                return false;
            }
        start++;
        end--;
        }
        
        return true;
        
    }
};