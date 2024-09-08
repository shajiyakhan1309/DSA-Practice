import java.util.*;

public class removeLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = 50;

        System.out.print("Enter the elements of the list from 1-50: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
            if (list.get(i) < 1 || list.get(i)> 50) {
                System.out.println("Invalid value, please enter a value in the range of 1-10.");
                break;
            }
           
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int currentValue = iterator.next();
            if (currentValue > 25) {
                iterator.remove(); 
            }
        }

        System.out.println("Final list after removing elements greater than 25: " + list);
        sc.close();
    }
} 
    

