class Solution {
    public String removeStars(String s) {
        StringBuilder ss=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='*'){
                st.pop();
            }
            
        }
        for(char ch:st){
            ss.append(ch);
        }
    
        return ss.toString();
        
    }
}