class Solution {
    public int searchInsert(int[] nums, int target) {
     
        int primeiro = 0;
        int ultimo = nums.length - 1;

        while(primeiro <= ultimo){
            int meio = primeiro + (ultimo - primeiro)/2;
            if (nums[meio] == target){
                return meio;
            }else if (target < nums[meio]) {
                ultimo = meio - 1;
            }else{
                primeiro = meio + 1;
            }
        }
        return primeiro;

        
    }
}
