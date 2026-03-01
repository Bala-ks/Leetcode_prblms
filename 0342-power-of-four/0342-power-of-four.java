class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)    return true;
        int sb = Integer.bitCount(n);
        int len = Integer.toBinaryString(n).length();
        return (sb == 1 && (len-sb)%2 == 0) ? true : false;
    }
}