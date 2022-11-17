import java.util.Date;

public class Person {
    private String Name,yearOfBirth;

    public Person() {
        Name="";
        yearOfBirth="";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';
    }
}