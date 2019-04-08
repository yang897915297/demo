package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * —È÷§
 * @author lenovo
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		if(names.isEmpty()){
			
		}
	}
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0;i<nums.length; i++) {
            if(hm.get(nums[i])!= null) {
                return new int []{hm.get(nums[i]), i};
            } else {
                hm.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }

}
