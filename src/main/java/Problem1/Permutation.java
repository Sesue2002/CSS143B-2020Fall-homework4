package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new ArrayList<>(), result);
        return result;
    }

    //helper
    private static void permute(int[] nums, List<Integer> resultList, List<List<Integer>> result){
        if(resultList.size() == nums.length){
            result.add(new ArrayList<>(resultList));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(resultList.contains(nums[i])){
                    continue;
                }
                resultList.add(nums[i]);
                permute(nums, resultList, result);
            }
        }
    }
    private static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
