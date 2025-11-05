class Student {
    int id;
    String name;

    Student(int i, String n) {   // constructor
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class Code18{
    public static void main(String[] args) {
            Student s1 = new Student(101, "Isha");
            Student s2 = new Student(102, "Ranveer");
            s1.display();
            s2.display();
        }
}
