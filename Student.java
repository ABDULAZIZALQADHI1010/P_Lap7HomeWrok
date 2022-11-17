public class Student extends Person{
    private String Major;

    public Student() {
        this.Major="";
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student Name=\'" +this.getName()+'\''+
                " , Student Year of birth=\'" +this.getYearOfBirth()+'\''+
                " , Major='" + Major + '\'' +
                '}';
    }
}
