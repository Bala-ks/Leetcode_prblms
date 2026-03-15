class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> set = new HashSet<>();
        int temp = sumOfSquares(n);
        while(!(set.contains(temp))){
            set.add(temp);
            temp = sumOfSquares(temp);
            if(temp == 1)   return true;
        }
        return false;
    }

    public int sumOfSquares(int n) {
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

}