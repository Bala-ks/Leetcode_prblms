class Solution {
    public int bitwiseComplement(int n) {

        StringBuilder res = new StringBuilder(Integer.toBinaryString(n));
           System.out.println(res);
        for(int i=0;i<res.length();i++){
            if(res.charAt(i) == '1')  res.setCharAt(i,'0');
            else res.setCharAt(i,'1');
        }
        System.out.println(res);
        return Integer.parseInt(res.toString(),2);
    }
}