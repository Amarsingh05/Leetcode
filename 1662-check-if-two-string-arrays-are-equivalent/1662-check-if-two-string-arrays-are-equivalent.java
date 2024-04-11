class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1=String.join("",word1);
        String st2=String.join("",word2);
//         char[]first=st1.toCharArray();
//         char[]second=st2.toCharArray();
       
//         String prepared1=new String(first);
//         String prepared2=new String(second);
     return st1.equals(st2);
        
    }
}