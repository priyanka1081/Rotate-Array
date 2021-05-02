package Arrays;

public class RotateArray {
	
	public int[] rotate(int[] nums, int k) {
        int[] res=new int[nums.length];
        
        for(int i=0;i<k; i++) {
        	res[k-i-1]= nums[nums.length-1-i];
        }
        
        for(int j=k;j<nums.length; j++) {
        	res[j]=nums[j-k];
        }
        
        return res;
    }

	public static void main(String[] args) {
		RotateArray ra= new RotateArray();
		int[] nums= {-1,-100,3,99};
		int k=2;
		int[] a=ra.rotate(nums, k);
		
		for(int x:a) {
			System.out.println(x);
		}

	}

}
