class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int len = binary.length();
        
        int j = -1;     
        int dis = 0;   
        
        for (int i = 0; i < len; i++) {
            if (binary.charAt(i) == '1') {
                if (j != -1) {
                    dis = Math.max(dis, i - j);
                }
                j = i; 
            }
        }
        
        return dis;
    }
}