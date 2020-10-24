/**
 *两数之和
 * */
public class TwoSum{
//    暴力解法
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            // if(i>0&&nums[i]==nums[i-1]){
            //     continue;
            // }
            for(int j=i+1;j<nums.length;j++){
                // if(j>i+1 && nums[j]==nums[j-1]){
                //     continue;
                // }

                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}