public class OOPStypesofcons {
    public static void main(String[] args) {

        Student s1 = new Student();              // default constructor
        Student s2 = new Student("Shradha");     // constructor with String
        Student s3 = new Student(123);            // constructor with int

        // Student s4 = new Student("Aman", 567); // ❌ invalid (no such constructor)
    }
}

class Student {
    String name;
    int roll;

    // 1️⃣ Default constructor
    Student() {
        System.out.println("Constructor is called...");
    }

    // 2️⃣ Constructor with name
    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // 3️⃣ Constructor with roll
    Student(int roll) {
        this.roll = roll;
        System.out.println("Roll: " + roll);
    }
}
