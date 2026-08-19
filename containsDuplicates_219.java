import java.util.*;
public class containsDuplicates_219{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> number = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(number.containsKey(nums[i])){
                if(Math.abs(number.get(nums[i])-i)<=k)
                    return true;
            }             
            number.put(nums[i],i);
        }
        return false;
    }
}