import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int first_num = 0;
        for (int i = 0; i < nums.length; i++) {
            first_num = nums[i];
            int y = target - first_num;
            if (map.containsKey(y)) {
                return new int[] { map.get(y), i };
            } else if (map.containsValue(0)) {
                map.put(first_num, i);
            } else {
                map.put(first_num, i);
            }
        }
        return nums;
    }
}
