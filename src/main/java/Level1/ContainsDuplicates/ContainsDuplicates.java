package Level1.ContainsDuplicates;

import java.util.stream.Stream;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    System.out.println(nums[j]);

                    return true;
                }
            }
        }
        return false;

    }
}
