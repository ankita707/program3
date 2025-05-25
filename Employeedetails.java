public class Employeedetails {
public static void main(String[] args) {
Employee emp = new Employee("John Doe", "1990-08-25", "yyyy-MM-dd", "E1234", 50000.0);
emp.displayPersonName();
emp.displayPersonAge();
emp.displayEmployeedetails();
}
}

class person {
private String name;
private java.time.LocalDate dateOfBirth;

public person(String name, String dobStr, String format) {
java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern(format);
this.name = name;
this.dateOfBirth = java.time.LocalDate.parse(dobStr, formatter);
}

public void displayPersonName() {
System.out.println("Person Name: " + name);
    }

public void displayPersonAge() {
int age = java.time.Period.between(dateOfBirth, java.time.LocalDate.now()).getYears();
System.out.println("Person Age: " + age + " years");
}
}

class Employee extends person {
private String empId;
private double salary;

public Employee(String name, String dobStr, String format, String empId, double salary) {
super(name, dobStr, format);
this.empId = empId;
this.salary = salary;
}

public void displayEmployeedetails() {
System.out.println("Employee ID: " + empId);
System.out.println("Salary: ₹" + salary);
}
}