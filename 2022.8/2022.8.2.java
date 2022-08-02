704. 二分查找
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。


示例 1:

输入: nums = [-1,0,3,5,9,12], target = 9
输出: 4
解释: 9 出现在 nums 中并且下标为 4
示例 2:

输入: nums = [-1,0,3,5,9,12], target = 2
输出: -1
解释: 2 不存在 nums 中因此返回 -1
  
  class Solution {
    public int search(int[] nums, int target) {
         int n=nums.length;
        //先看一下这个数是否比第一个数小或者比最后一个数大
        if(n==0||target<nums[0]||target>nums[n-1]){
            return -1;
        }
        int left=0,right=n;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        
     return -1;

    }
}
