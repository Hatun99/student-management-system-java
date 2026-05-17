public class Student {

    private int id;
    private String name;
    private String major;

    // Constructor
    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("-------------------");
    }
}