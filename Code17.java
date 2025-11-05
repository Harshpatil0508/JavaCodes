class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Code17{
     public static void main(String[] args) {
        Student s1 = new Student();  // object 1
        s1.id = 101;
        s1.name = "Isha";
        s1.display();
    }
}