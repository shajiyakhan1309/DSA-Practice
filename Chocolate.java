import java.util.*;
public class Chocolate
{
    public static void findMinDiff (int a[], int n, int m)
    {
    Arrays.sort(a);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            if(a[i+m-1]-a[i]<min_diff){
                min_diff = a[i+m-1]-a[i];
            }
        }
        System.out.println(min_diff);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        
        int n = sc.nextInt();
        int a [] = new int [n];
        System.out.println("Enter the number of students: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        findMinDiff(a , n , m);
    }
}
