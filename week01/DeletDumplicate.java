/**
 * 删除排序数组中的重复项
 * */
public class DeletDumplicate {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int low = 0;
        for(int fast=1;fast<nums.length;fast++) {

            if(nums[fast]!=nums[low]){
                nums[low+1]=nums[fast];
                low++;
            }
        }
        return low+1;
    }
}