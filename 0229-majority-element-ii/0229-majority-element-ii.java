class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int total=nums.length/3;
        for(int i=0;i<nums.length;i++){
        int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    
                }
                }
                if(count>total){

                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
                
            }
            
            
        }
        return list;
        
    }
}