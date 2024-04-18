class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='*'){
                st.pop();
            }
            
        }
        StringBuilder ss=new StringBuilder();
        for(char ch:st){
            ss.append(ch);
        }
    
        return ss.toString();
        
    }
}