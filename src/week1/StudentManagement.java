package week1;

public class StudentManagement {
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student student[] = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup() == s2.getGroup())
            return true;
        else return false;
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
        //Student sv2 = new Student();
        sv1.setName("Hoang Anh");
        sv1.setId(17020577);
        sv1.setGroup("INT2204");
        sv1.setEmail("nguyenhoanganh01a2@gmail.com");
        System.out.println("Name: " +sv1.getName());
        System.out.println("Info: " + "\n" +sv1.getInfo());
        System.out.println("----------------------------");


        // TODO: cau 8
        Student hs1 = new Student();
        hs1.getInfo();
        System.out.println("Info1:   " + hs1.getInfo());
        Student  hs2 = new Student( "Hoang" , 123 , "gg@vnu.edu.vn" );
        hs2.getInfo();
        System.out.println("Info2: " + hs2.getInfo());
        Student hs3 = new Student(sv1);
        hs3.getInfo();
        System.out.println("Info3: " +hs3.getInfo());

        System.out.println("-----------------------------");


        // TODO: cau 9 + 10
        StudentManagement a = new StudentManagement();
        Student s1 = new Student("Nguyen",123,"hu@gmail.com");

        Student s2 = new Student("Hoang",345,"gg@gmail.com");

        Student s3 = new Student("Anh",567,"ff@gmail.com");
        s3.setGroup("INT22042");
        if(a.sameGroup(s1,s3)==true) System.out.println("cung lop");
        else System.out.println("khac lop");
        if(a.sameGroup(s1,s2)==true) System.out.println("cung lop");
        else System.out.println("khac lop");




    }
}
