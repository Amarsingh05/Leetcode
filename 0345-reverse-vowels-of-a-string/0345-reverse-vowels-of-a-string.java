class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[]str=s.toCharArray();
        while(start<end){
            if(!isvowel(s.charAt(start))){
                start++;
            }
            if(!isvowel(s.charAt(end))){
                end--;
            }
            if(isvowel(s.charAt(start)) &&isvowel(s.charAt(end))){
                char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
            }

        }
        String st=new String(str);
        return st;
        

    }
    public boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
        c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
            }
            return false;

    }
}