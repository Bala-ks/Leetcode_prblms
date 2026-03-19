class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length()) return false;
        Map<Character,Integer> sm = new HashMap<>();
        Map<Character,Integer> tm = new HashMap<>();
        for(int i = 0;i<n;i++){
            char t1 = s.charAt(i);
            char t2 = t.charAt(i);
            sm.put(t1,sm.getOrDefault(t1,0)+1);
            tm.put(t2,tm.getOrDefault(t2,0)+1);
        }
        return sm.equals(tm);
    }
}