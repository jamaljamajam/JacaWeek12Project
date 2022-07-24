package constructors;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    public Employee() {
        salary = 10000;
    }

    static {
        companyName = "Microsoft";
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }
}
