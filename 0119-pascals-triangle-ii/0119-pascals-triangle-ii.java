class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> result = new ArrayList<>();
         if (rowIndex >= 0) {
            result.add(Arrays.asList(1));
        }
        if (rowIndex >= 1) {
            result.add(Arrays.asList(1, 1));
        }

        for(int i = 2;i<=rowIndex;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j<= i;j++){
                if(j == 0 || j == i)    temp.add(1);
                else{
                    temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
                
            }
            result.add(temp);
        }
        return result.get(rowIndex);
    }
}