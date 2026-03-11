class Solution {
    public int bitwiseComplement(int n) {
        int temp = 0;
        int len = Integer.toBinaryString(n).length();
        for(int i=0;i<len;i++){
            temp = temp<<1|1;
        }
        return temp^n;
    }
}