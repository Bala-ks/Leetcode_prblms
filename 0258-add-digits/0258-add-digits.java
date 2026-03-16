class Solution {
    public int addDigits(int num) {
        int res = num;
        while(res > 9 ){
            res = finddigitsum(res);
        }
        return res;
    }
    public int finddigitsum(int n){
        int temp=0;
        while(n>0){
            temp+=n%10;
            n/=10;
        }
        return temp;
    }
}