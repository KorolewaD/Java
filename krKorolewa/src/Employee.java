class Employee{
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, String position, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
