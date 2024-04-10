class Solution {
    public int lengthOfLastWord(String s) {
        String[] sa=s.split(" ");
        String word=sa[sa.length-1];
        return word.length();
    }
}