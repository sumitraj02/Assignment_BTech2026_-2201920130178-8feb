/*Create a `Person` class and extend it to `Student` and `Teacher`. Include 
attributes unique to each and demonstrate inheritance. */
// Base class: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: Student
class Student extends Person {
    private String studentId;
    private String major;

    // Constructor
    public Student(String name, int age, String studentId, String major) {
        super(name, age); // Call the base class constructor
        this.studentId = studentId;
        this.major = major;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Override displayDetails to include student-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

// Derived class: Teacher
class Teacher extends Person {
    private String teacherId;
    private String subject;

    // Constructor
    public Teacher(String name, int age, String teacherId, String subject) {
        super(name, age); // Call the base class constructor
        this.teacherId = teacherId;
        this.subject = subject;
    }

    // Getters and Setters
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override displayDetails to include teacher-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}

// Main class to demonstrate inheritance
public class PersonDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20, "S12345", "Computer Science");
        System.out.println("Student Details:");
        student.displayDetails();
        System.out.println();

        // Create a Teacher object
        Teacher teacher = new Teacher("Mr. Smith", 45, "T98765", "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();
    }
}
