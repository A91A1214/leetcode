// import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int i = 1; // number to check (1 to n)
        int j = 0; // index in sorted array

        while (i <= nums.length) {

            while (j < nums.length && nums[j] < i) {
                j++;
            }

            if (j == nums.length || nums[j] != i) {
                list.add(i);
            }

            i++;
        }

        return list;
    }
}