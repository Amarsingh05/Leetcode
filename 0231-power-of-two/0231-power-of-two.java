class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int x=0;
        double result=0;
        if(n==0){
            return false;
        }
        while(result<n){

            result=Math.pow(2,x);
        System.out.println(result);
            System.out.println(x);
            x++;
        
        }
        if(result==n){
            System.out.println("if"+result);
            return true;
        }
        return false;
        
    }
}