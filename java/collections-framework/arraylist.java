import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        //Java Collection Frame work
        //Vector jaise hota hai waise hei yeh hota hai java me
        //String | Boolean | Float
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

        list.add(1);//O(1)
        list.add(2);//O(1)
        list.add(3);//O(1)
        list.add(4);//O(1)
        list.add(5);//O(1)
        list.add(6);//O(1)

        list.add(0, 5);//O(n)
        
        System.out.println(list);

        //Get Operation 
        int element = list.get(3);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);

        //Set
        list.set(4,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        
    }
}
