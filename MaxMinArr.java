import java.util.*;
class MaxMinArr{
    public static void getMinMax(int  arr[]  , int min , int max) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            
            }
            if(arr[i]<=min){
                min = arr[i];
            
            }
        }
        System.out.println("Maximum value is : "+ max);
        System.out.println("Minmum value is : "+ min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the values of array: ");
        for(int i=0;i<size;i++){
         arr [i] = sc.nextInt();
        }
        int min = 6;
        int max = 1;
        
        getMinMax(arr,min,max);
    }
}

