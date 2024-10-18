// Kelas induk pertama
class Person {
    private String name;
    private int age;

    // Constructor Overloading
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: getter and setter
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

    // Method yang akan di-override
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

// Kelas induk kedua
class Job {
    private String jobTitle;
    private double salary;

    // Constructor
    public Job(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Encapsulation: getter and setter
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Polimorfisme melalui Overloading
    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public void displaySalary(String currency) {
        System.out.println("Salary: " + currency + salary);
    }
}

// Kelas anak pertama (Inheritance dari Person)
class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // Memanggil constructor dari kelas induk
        this.major = major;
    }

    // Overriding method introduce dari kelas Person
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "-year-old student majoring in " + major + ".");
    }

    // Getter dan setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

// Kelas anak kedua (Inheritance dari Person)
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding method introduce dari kelas Person
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "-year-old teacher, teaching " + subject + ".");
    }

    // Getter dan setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

// Kelas anak ketiga (Inheritance dari Job)
class Manager extends Job {
    private int teamSize;

    // Constructor Overloading
    public Manager(String jobTitle, double salary, int teamSize) {
        super(jobTitle, salary); // Memanggil constructor dari kelas induk
        this.teamSize = teamSize;
    }

    // Overriding method displaySalary dari kelas Job
    @Override
    public void displaySalary() {
        System.out.println("Manager's salary: " + getSalary() + " for managing a team of " + teamSize + " people.");
    }

    // Getter dan setter
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Encapsulation: menggunakan getter dan setter
        Student student = new Student("Alice", 20, "Computer Science");
        student.introduce(); // Polimorfisme: method overriding

        Teacher teacher = new Teacher("Mr. Bob", 35, "Mathematics");
        teacher.introduce(); // Polimorfisme: method overriding

        Manager manager = new Manager("Project Manager", 8000, 10);
        manager.displaySalary(); // Polimorfisme: method overriding dan overloading

        // Menggunakan setter untuk mengubah data
        teacher.setSubject("Physics");
        teacher.introduce(); // Polimorfisme setelah data diubah dengan setter

        // Overloading pada method displaySalary
        manager.displaySalary("USD ");
    }
}
