package Practice;

class Candidate {
    public Candidate() {
        System.out.println("Candidate class constructor called");
    }
}

public class Employee extends Candidate {
    public Employee() {
        System.out.println("Employee class constructor called");
    }

    public static void main(String args[]) {
        Employee e = new Employee();
    }
}
