class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ar=new int[nums.length*2];
        int pos=0;
        for(int num:nums){
            ar[pos]=num;
            pos++;
        }
        for(int num:nums){
            ar[pos]=num;
            pos++;
        }
        
        
        return ar;
        
        
        
    }
}