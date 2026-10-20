import java.util.*;

public class arraylistsort {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);
        //ascending order
        System.out.println("Original ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorted ArrayList: " + list);
        //comparator-fnx logic
    }
}
