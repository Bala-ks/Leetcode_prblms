class Solution {
    public boolean isAnagram(String s, String t) {
       int n = s.length();
       if(n != t.length())  return false;

       char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}