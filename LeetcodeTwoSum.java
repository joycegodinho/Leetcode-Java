/**
 *Given an array of integers nums and an integer target, return indices 
 *of the two numbers such that they add up to target.
 */

/**
 *
 * @author joyce
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++){
                
                for (int j = i+1; j < nums.length; j++){
                    int solution = nums[i] + nums[j];
                    
                    if (solution == target){
                        return new int[] { i, j };
                    }
                }
            }
            return new int[0];
    }
    
}
