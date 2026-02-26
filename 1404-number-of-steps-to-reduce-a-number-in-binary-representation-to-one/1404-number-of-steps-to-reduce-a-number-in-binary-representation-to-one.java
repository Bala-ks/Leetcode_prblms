import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger number = new BigInteger(s,2);
        int steps = 0;
        while(number.compareTo(BigInteger.valueOf(1)) != 0){
            if(number.mod(BigInteger.valueOf(2)) == BigInteger.valueOf(0)){
                number = number.divide(BigInteger.valueOf(2));
                steps++;
            }
            else{
                number = number.add(BigInteger.valueOf(1));
                steps++;
            }
        }
        return steps;
    }
}