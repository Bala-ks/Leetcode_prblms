class Solution {
    public int addDigits(int num) {
        while(num > 9 ){
            num = finddigitsum(num);
        }
        return num;
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