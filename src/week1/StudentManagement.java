package week1;

public class StudentManagement {
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student student[] = new Student[100];

    public boolean sameGroup(Student s1, Student s2, Student s3) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {

        // TODO: them doi tuong

        Student sv1 = new Student();
        Student sv2 = new Student();
        sv1.setName("Hoang Anh");
        sv1.setId(17020577);
        sv1.setGroup("INT2204");
        sv1.setEmail("nguyenhoanganh01a2@gmail.com");
        System.out.println("Name: " +sv1.getName());
        System.out.println("Info: " + "\n" +sv1.getInfo());


        Student s1 = new Student();
        s1.setGroup("INT22041");
        Student s2 = new Student();
        s2.setGroup("INT22041");
        Student s3 = new Student();
        s3.setGroup("INT22042");

        System.out.print("s1 cung group s2 : ");
        System.out.println(s1.getGroup().equals(s2.getGroup()));
        System.out.print("s3 cung group s1,s2 : ");
        System.out.println(s1.getGroup().equals(s3.getGroup()));



    }
}
