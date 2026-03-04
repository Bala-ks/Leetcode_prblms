class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1 && rows(mat,i,j) && cols(mat,i,j))    count++;
            }
        }
        return count;
    }
    public boolean rows(int[][] mat,int i,int j){
        for(int k=0;k<mat[i].length;k++){
            if(mat[i][k] == 1 && k != j) return false;
        }
        return true;
    }

     public boolean cols(int[][] mat,int i,int j){
        for(int k=0;k<mat.length;k++){
            if(mat[k][j] == 1 && k != i) return false;
        }
        return true;
    }
}