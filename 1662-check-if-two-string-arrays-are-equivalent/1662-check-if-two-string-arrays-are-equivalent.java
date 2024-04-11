class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1=String.join("",word1);
        String st2=String.join("",word2);
        char[]first=st1.toCharArray();
        char[]second=st2.toCharArray();
        // Arrays.sort(first);
        // Arrays.sort(second);
        String prepared1=new String(first);
        String prepared2=new String(second);
        if (prepared1.equals(prepared2)){
            return true;
        }
        return false;
        
    }
}