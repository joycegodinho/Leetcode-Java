public class leetcodeContainerWithMostWater {

    public static void main(String[] args){

        int[] height = {1,8,6,2,5,4,8,3,7};
        leetcodeContainerWithMostWater u = new leetcodeContainerWithMostWater();
        System.out.println("Teste");
        System.out.println(u.maxArea(height));

    }

    public int maxArea(int[] height) {

        int areaMax = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){

            int area = Math.min(height[i], height[j])*(j-i);
            areaMax = Math.max(areaMax, area);

            if(height[i] < height[j]){
                i = i + 1;
            }else{
                j = j - 1;
            }

        }


        return areaMax;
        
    }
    
}
