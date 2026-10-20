public class OOPScopycons {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Copy constructor call
        Student s2 = new Student(s1);

        // Change password of copied object
        s2.password = "xyz";

        // Change original object's marks
        s1.marks[2] = 100;

        // Print copied object's marks
        for (int i = 0; i < 3; i++) {
            System.out.print(s2.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Default constructor
    Student() {
        marks = new int[3];
    }

    // Copy constructor (Deep Copy)
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

