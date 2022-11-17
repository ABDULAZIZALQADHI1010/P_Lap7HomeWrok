public class TestProgram {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Abdulaziz");
        p.setYearOfBirth("2002/09/15");

        Student s=new Student();
        s.setName(p.getName());
        s.setYearOfBirth(p.getYearOfBirth());
        s.setMajor("IT");

        Instructor i=new Instructor();
        i.setName("Ahmed");
        i.setYearOfBirth("1998/10/20");
        i.setSalary(20000);

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(i.toString());

    }
}
