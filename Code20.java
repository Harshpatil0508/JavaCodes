class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;       // 'this' differentiates class variables from local
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class Code20{
     public static void main(String[] args) {
        Student s = new Student(101, "Isha");
        s.display();
    }
}