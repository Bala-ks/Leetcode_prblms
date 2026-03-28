class Solution {
    public String countAndSay(int n) {
        if(n == 1)  return "1";
        StringBuilder res = new StringBuilder();
        res.append("1");
        char curr = res.charAt(0);
        for(int i = 1;i<n;i++){
            res = rle(res);
        }
        return res.toString();
    }

    public StringBuilder rle(StringBuilder res){
        int len = res.length();
        StringBuilder t2 = new StringBuilder();
        
        for(int i = 0;i<len;i++){
            int count = 1;
            int temp = i+1;
            char t3 = res.charAt(i);
            while(temp < len && t3 == res.charAt(temp++)){
                count++;
            }
            t2.append(count);
            t2.append(t3);
            i += count-1;
        }
        return t2;
    }
}