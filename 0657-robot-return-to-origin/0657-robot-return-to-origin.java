class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0, side = 0;
        int n = moves.length();
        for(int i = 0;i<n;i++){
            char temp = moves.charAt(i);
            switch(temp){
                case 'U':
                    up++;
                    break;
                case 'D':
                    up--;
                    break;
                case 'R':
                    side++;
                    break;
                case 'L':
                    side--;
                    break;

            }

        }

        return up == 0 && side == 0;
        
    }
}