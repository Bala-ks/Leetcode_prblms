class Solution {
    public boolean isPerfectSquare(int num) {

        double b = Math.sqrt(num);
        int a = (int) b;
        if(a == b)  return true;
        return false;
        
    }
}