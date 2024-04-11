class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words=s.split(" ");
        Map <Character,String> hm=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(!hm.containsValue(words[i])){
                    hm.put(pattern.charAt(i),words[i]);
                }
                else
                {
                    return false;
                }
                
            }
            else{
                String mapped=hm.get(pattern.charAt(i));
                if(!mapped.equals(words[i])){
                    return false;
                }
            }
        }
        return true;
        
        
    }
}