class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Samadhan", 21);
        s1.display();
        s2.display();
    }
}
