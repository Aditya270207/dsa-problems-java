package Encapsulation;

public class Employee {
    private String name;
    private int age;
    private int salary;

    // Constructor
    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Main method inside the class
    public static void main(String[] args) {
        Employee e1 = new Employee("Aditya", 20, 50000);

        // Print employee details
        System.out.println(e1);

        // Modify values using setters
        e1.setSalary(60000);
        e1.setAge(21);

        // Print updated details
        System.out.println(e1);
    }
}

