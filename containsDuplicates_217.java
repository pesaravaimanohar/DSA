import java.util.*;
public class containsDuplicates_217{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int x:nums){
            if(!numbers.add(x))
                return true;
        }
        return false;
    }
}