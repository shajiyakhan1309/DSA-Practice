import java.util.*;
class maxSubArray {
    public int maxSubArray(int[] nums) {
        int curr_max = 0;
        int overall_max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr_max = Math.max(curr_max+nums[i],nums[i]);
            overall_max = Math.max(overall_max , curr_max);
            
        }
        return overall_max;
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int nums[] = new int [size];
        System.out.println("Enter the contents of array: ");
        for(int i=0;i<size;i++){
             nums [i] = sc.nextInt();
        }
         
        maxSubArray sol = new maxSubArray();
        int result = sol.maxSubArray(nums);
        System.out.print("Maximum Subarray is: "+ result);
        }
    }
