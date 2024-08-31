import java.util.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums_set.contains(nums[i])){
                return true;
            }else{
                nums_set.add(nums[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int nums [] = new int [size];
        System.out.println("Enter the values of array: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
      boolean result = containsDuplicate(nums);
      System.out.println(result);
    }
}
