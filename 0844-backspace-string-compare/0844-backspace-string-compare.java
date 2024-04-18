class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return getstring(s).equals(getstring(t));
    }
    public String getstring(String a){
        StringBuilder sb=new StringBuilder();
        for(char ch:a.toCharArray()){
            if(ch!='#'){
                sb.append(ch);
            }
            else
            {
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length()-1);
            }
        }
        
    }
        return sb.toString();
}
}