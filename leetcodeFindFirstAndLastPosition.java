// leetcode find first and last position

public class leetcodeFindFirstAndLastPosition {

    public static void main(String[] args){
        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        leetcodeFindFirstAndLastPosition sol = new leetcodeFindFirstAndLastPosition();
        int[] result = sol.searchRange(nums1,target1);
        System.out.println("TESTE");
        System.out.println(java.util.Arrays.toString(result));

    }
    

    public int[] searchRange(int[] nums, int target) {

        int[] resp = new int[]{-1,-1};

        for (int i=0; i < nums.length; i++){
            if (nums[i] == target){
                resp[0] = i;
                break;
            }
        } 
        
        for (int j = nums.length-1 ; j >= 0 ; j--){
            if (nums[j] == target){
                resp[1] = j;
                break;
            }
        }
        
        return resp;
        }

    
}
