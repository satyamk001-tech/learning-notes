public class OOPSconstructor {
    public static void main(String[] args) {
       Student s1= new Student();
       //System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(){
        //this.name=name;
        System.out.println("constructor is called....");
    }
}
