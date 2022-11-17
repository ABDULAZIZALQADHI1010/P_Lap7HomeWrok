public class Instructor extends Person{
    private double Salary;

    public Instructor() {
        Salary=0d;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "Instructor Name=\'" +this.getName()+'\''+
                " , Instructor Year of birth=\'" +this.getYearOfBirth()+'\''+
                " , Salary=" + Salary +'\''+
                '}';
    }
}
