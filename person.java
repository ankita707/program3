public class person {
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

public static void main(String[] args) {
person p = new person("John Doe", "1990-08-25", "yyyy-MM-dd");
p.displayPersonName();
p.displayPersonAge();
}}