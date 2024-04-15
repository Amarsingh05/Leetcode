class Solution {
    public int reverse(int x) {
        String num=String.valueOf(x);
        char []arr=num.toCharArray();
        if(x<0){
        int start=1;
        int end=num.length()-1;
        
            
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            String st=new String(arr);
            long ans=Long.parseLong(st);
            
            return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;    } 
        else{
            int start=0;
        int end=num.length()-1;
        
            
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            String st=new String(arr);
            
            long ans=Long.parseLong(st);
            
            return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;

            
            
        }
        
    }
    
}