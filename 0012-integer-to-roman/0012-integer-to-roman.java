class Solution {
    public String intToRoman(int num) {

        StringBuilder res = new StringBuilder();

        int nooft = (num%10000)/1000;
        int noofh = (num%1000)/100;
        int noofte = (num%100)/10;
        int noofo = num%10;

        if(nooft > 0){
            while(nooft != 0 ){
                res.append("M");
                nooft--;
            }
        }

        if(noofh > 0){
            if(noofh == 4){
                res.append("CD");
            }
            else if(noofh == 9){
                res.append("CM");
            }
            else{
                if(noofh >= 5){
                    res.append("D");
                    noofh -= 5;
                }
                while(noofh != 0){
                    res.append("C");
                    noofh--;
                }
            }
        }

        if(noofte > 0){
            if(noofte == 4){
                res.append("XL");
            }
            else if(noofte == 9){
                res.append("XC");
            }
            else{
                if(noofte >= 5){
                    res.append("L");
                    noofte-=5;
                }
                while(noofte != 0){
                    res.append("X");
                    noofte--;
                }
            }
        }

        if(noofo >0){
            if(noofo == 4){
                res.append("IV");
            }
            else if(noofo == 9) res.append("IX");
            else{
                if(noofo >= 5){
                    res.append("V");
                    noofo-=5;
                }
                while(noofo != 0){
                    res.append("I");
                    noofo--;
                }
            }
        }

        return res.toString();
        
    }
}