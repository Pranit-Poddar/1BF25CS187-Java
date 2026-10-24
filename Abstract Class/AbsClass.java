abstract class Employee {
    abstract void salary();
}

class HR extends Employee {
    void salary() {
        System.out.println("HR Salary: Rs. 30,000");
    }
}

class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary: Rs. 50,000");
    }
}

public class AbsClass {
    public static void main(String[] args) {
        Employee hr = new HR();
        Employee manager = new Manager();

        hr.salary();
        manager.salary();
    }
}