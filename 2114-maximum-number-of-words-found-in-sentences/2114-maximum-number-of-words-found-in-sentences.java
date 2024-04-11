class Solution {
    public int mostWordsFound(String[] sentences) {
        int totalcount=0;
        for(int i=0;i<sentences.length;i++){
        
            int curcount=sentences[i].split(" ").length;
        
            if(curcount>totalcount){
                totalcount=curcount;
            }
        }
        return totalcount;
        
    }
}