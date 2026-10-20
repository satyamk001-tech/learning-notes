import java.util.*;
public class arraylistswap {
    public static void swap(ArrayList<Integer>list,int i,int j){
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);//O(1)
        list.add(5);//O(1)
        list.add(9);//O(1)
        list.add(3);//O(1)
        list.add(6);//O(1)

        int idx1=1;
        int idx2=3;
        System.out.println(list);

        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
