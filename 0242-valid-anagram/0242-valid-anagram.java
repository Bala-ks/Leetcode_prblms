class Solution {
    public boolean isAnagram(String s, String t) {
       int n = s.length();
       if(n != t.length())  return false;

        return (Array.sort(s.toCharArray())).equals(Array.sort(t.toCharArray()));

    }
}