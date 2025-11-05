// ENCAPSULATION

class Student {
    // Step 1: Private variables
    private String name;
    private int age;

    // Step 2: Public getter & setter methods
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a > 0)
            age = a;
        else
            System.out.println("Invalid age!");
    }
}

public class Code33 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Isha");
        s.setAge(21);

        System.out.println(s.getName() + " : " + s.getAge());
    }
}
