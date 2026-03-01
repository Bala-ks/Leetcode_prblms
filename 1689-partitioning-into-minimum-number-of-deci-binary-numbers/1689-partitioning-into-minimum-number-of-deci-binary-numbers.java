class Solution {
    public int minPartitions(String s) {
        int len = s.length();
        int max = 0;
        for(int i=0;i<len;i++){
            int temp = s.charAt(i)-'0';
            if(temp > max) max = temp;
        }
        return max;
    }
}