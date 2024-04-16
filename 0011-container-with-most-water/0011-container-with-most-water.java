class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1; 
        int max=0;
        while(start<end){
            int sheight=height[start];
            int eheight=height[end];
            int minheight=Math.min(sheight,eheight);
           
            int curmax=(end-start)*minheight;
            if(max<curmax){
                max=curmax;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            
            
        }
        return max;
        
        
        
    }
}