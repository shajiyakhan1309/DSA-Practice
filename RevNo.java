import java.util.ArrayList;
class RevNo {
    public static void reverseSubArray(ArrayList<Integer> arr, int l,
        int r) {
                for(int i=0;i<arr.size();i++){
                    if(i == r){
                        arr.reversed();
                    }
                }
                       
        }                                   
        
        public static void main(String args[]){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            arr.add(6);
            arr.add(7);
            
            System.out.println(arr);
            
            int l = 2;
            int r = 4;
            
            reverseSubArray(arr, l, r);
        }
    }