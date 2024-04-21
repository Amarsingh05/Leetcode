class Solution {
    public boolean isHappy(int n) {
        Set<Integer>hs=new HashSet<>();
        while(true){
            int sum=0;
            while(n>0){
                
            int curnum=n%10;
            n=n/10;
            sum+=curnum*curnum;  
            }
            // System.out.println(curnum+" and n "+n+" and sum= "+sum);
            
            if(sum==1)return true;
            
            n=sum;
            if(hs.contains(sum)){
                return false;
                
            }
            else{
                hs.add(sum);
            }
            
        }
       
        }
        
    
    }
