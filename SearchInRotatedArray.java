import java.util.Scanner;

class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2; //  midpoint calculation

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid; // Return the index of the target
            }

            // Determine if the left half is sorted
            if (nums[beg] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[beg] && target < nums[mid]) {
                    // Target is in the left half
                    end = mid - 1;
                } else {
                    // Target is not in the left half
                    beg = mid + 1;
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Right half is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    // Target is in the right half
                    beg = mid + 1;
                } else {
                    // Target is not in the right half
                    end = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array named nums
        int nums[] = new int[size];

        // Taking the array elements from the user
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking the target value from the user
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        
        SearchInRotatedArray sol = new SearchInRotatedArray();
        int result = sol.search(nums, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
