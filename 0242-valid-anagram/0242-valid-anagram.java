class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first=s.toCharArray();
        char[] second=t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        boolean flag=false;
        if(first.length!=second.length){
            return false;
        }
        for(int i=0;i<first.length;i++){
            if(first[i]!=second[i]){
                flag=false;
                return flag;
            }
            flag=true;
            
        }
        return flag;
        

        
    }
}