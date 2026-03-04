package Prcaticals;

public class Company {
    int id;
    String name;
    float salary;

    Company(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display1() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Company {
    String dept;

    Manager(int id, String name, float salary, String dept) {
        super(id, name, salary);   
        this.dept = dept;
    }

    public void display2() {
        System.out.println("Dept : " + dept);
        display1();
    }

    public static void main(String[] args) {
        Manager m = new Manager(10, "Vedika", 4000, "Sales");
        m.display2();
    }
}