class Solution {
    public boolean isMonotonic(int[] arr) {
        int n = arr.length;
        if(n == 1)  return true;
        boolean inc = true,dec = true;
        for(int i=0;i<n-1;i++){
            if(inc && arr[i] <= arr[i+1]){
                if(arr[i] < arr[i+1])   dec = false;
            }
            else if(dec && arr[i] >= arr[i+1]){
                if(arr[i] > arr[i+1])   inc = false;
            }
            else    return false;
        }
        return true;
    }
}