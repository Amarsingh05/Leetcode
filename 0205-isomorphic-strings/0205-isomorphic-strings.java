class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                if(!hm.containsValue(t.charAt(i)))
            {
                hm.put(s.charAt(i),t.charAt(i));
            }
                
            else{
                return false;
            }
            }
            else{
                char mappedchar=hm.get(s.charAt(i));
                if(mappedchar!=t.charAt(i)){
                    return false;
                }
            }
                   
        }
        return true;
        
    }
}