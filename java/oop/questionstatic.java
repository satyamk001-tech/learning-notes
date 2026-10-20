public class questionstatic {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(Student.schoolName);

        Student s3= new Student();
        s3.schoolName="ABC";
    }
}

class Student {
    int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem)/3; 
    }
    
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
