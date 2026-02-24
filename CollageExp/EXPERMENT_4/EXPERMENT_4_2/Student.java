package CollageExp.EXPERMENT_4.EXPERMENT_4_2;

class Student {

    int rollNumber;
    String name;
    String department;

    Student() {
        rollNumber = 0;
        name = "Unknown";
        department = "Not Assigned";
    }

    Student(int r, String n) {
        rollNumber = r;
        name = n;
        department = "Not Assigned";
    }

    Student(int r, String n, String d) {
        rollNumber = r;
        name = n;
        department = d;
    }

    void display() {
        System.out.println(rollNumber + " " + name + " " + department);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Anita", "CSE");

        s1.display();
        s2.display();
        s3.display();
    }
}
