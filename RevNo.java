import java.util.ArrayList;

class RevNo {
    public static void reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        int start = arr.indexOf(l);
        int end = arr.indexOf(r);

        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        
    }                                   
        
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        
        System.out.println("Original array: " + arr);
        
        int l = 2;
        int r = 4;
        
        reverseSubArray(arr, l, r);
        
        System.out.println("Array after reversing subarray: " + arr);
    }
}
