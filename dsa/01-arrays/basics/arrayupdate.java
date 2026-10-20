import java.util.*;
public class arrayupdate {
    public static void update(int marks[],int nonChangble) {
        nonChangble=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonChangble=5;
        update(marks,nonChangble);
        System.out.println(nonChangble);

        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }   
}
