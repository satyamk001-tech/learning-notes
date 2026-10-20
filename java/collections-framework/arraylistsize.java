import java.util.ArrayList;

public class arraylistsize {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);//O(1)
        list.add(2);//O(1)
        list.add(3);//O(1)
        list.add(4);//O(1)
        list.add(5);//O(1)
        
        System.out.println(list.size());

        //print the array list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //print reverse 
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
