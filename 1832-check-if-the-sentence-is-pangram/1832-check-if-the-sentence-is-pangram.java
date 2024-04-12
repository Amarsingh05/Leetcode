class Solution {
    public boolean checkIfPangram(String sentence) {
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String[] al=alpha.split("");
        for(int i=0;i<alpha.length();i++){
            if(!sentence.contains(al[i])){
                return false;
            }
            
        }
        return true;
        
    }
}