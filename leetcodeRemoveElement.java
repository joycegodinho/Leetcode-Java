class Solution {
    public int removeElement(int[] nums, int val){
        
        int init = 0;
        int fim = nums.length - 1;
        
        while (init <= fim){
            
            if (nums[init] != val) {
                init = init + 1;
            }
            else{
                int temp = nums[init];
                nums[init] = nums[fim];
                nums[fim] = temp;
                fim = fim - 1;
            }
        }
        
        return init;      
    }  
}



