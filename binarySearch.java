public class binarySearch {
    // https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(end >= start){
            int mid = start + (end-start)/2;
            if(nums[mid]== target){
                return mid;
            }if( nums[mid]> target){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
