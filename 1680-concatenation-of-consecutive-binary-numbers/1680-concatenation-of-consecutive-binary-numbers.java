class Solution {
    public int concatenatedBinary(int n) {

        long result = 0;
        int mod = 1000000007;

        for (int i = 1; i <= n; i++) {
            int bits = Integer.toBinaryString(i).length();  
            result = ((result << bits) + i) % mod;
        }

        return (int) result;
    }
}









/*

import java.math.BigInteger;

class Solution {
    public int concatenatedBinary(int n) {

        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            res.append(Integer.toBinaryString(i));
        }

        BigInteger big = new BigInteger(res.toString(), 2);
        BigInteger mod = new BigInteger("1000000007");

        return big.mod(mod).intValue();
    }
}

*/