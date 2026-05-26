package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC26 {
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		//List<Integer> temp = new ArrayList<>();
		
		//temp.add(nums[0]);
		
		int count = 1;
		int i=1; 
		while(i < n) {
			if(nums[i-1] != nums[i]) {
				nums[count] = nums[i];
				count++;
			} 
			i++;
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int ans = removeDuplicates(arr);
		System.out.println(ans);
	}

}
