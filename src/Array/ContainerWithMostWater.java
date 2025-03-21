package Array;

public class ContainerWithMostWater {
	

	    public static void maxArea(int[] arr) {
	        int l = 0;
	        int r = arr.length - 1;
	        int area;
	        int maxarea = Integer.MIN_VALUE;
	        while (l < r) {
	            area = Math.min(arr[l], arr[r]) * (r - l);
	            maxarea = Math.max(area, maxarea);
	            if (arr[l] <= arr[r]) {
	                l++;
	                continue;
	            }
	            r--;
	        }
	        System.out.println(maxarea);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,8,6,2,5,4,8,3,7};
		maxArea(arr);
	}

}
