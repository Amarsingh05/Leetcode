class Solution {
    public String removeStars(String s) {
        StringBuilder ss=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='*'){
                ss.append(ch);
                
            }
            else{
                ss.deleteCharAt(ss.length()-1);
            }
        }
     
        return ss.toString();
        
    }
}