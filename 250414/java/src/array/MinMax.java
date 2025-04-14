package array;

public class MinMax {
	public static void main(String[] args) {
		int[] nums= {77,88,99,-15,50,85,3,250};
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		for(int i =0; i<nums.length; i++) {
			sum += nums[i];
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("합계" + sum + "최댓값" + max + "최솟값" + min);
	}
}
